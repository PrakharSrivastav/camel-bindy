package ps.camel.no.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.fixed.BindyFixedLengthDataFormat;
import org.apache.camel.spi.DataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ps.camel.no.aggregation.CombineInfoStrategy;
import ps.camel.no.beans.RecordFilterBean;
import ps.camel.no.model.ADTR;
import ps.camel.no.model.GRUI;

public class FileRouteBuilder extends RouteBuilder {
    Logger logger = LoggerFactory.getLogger(FileRouteBuilder.class);

    @Override
    public void configure() throws Exception {

        DataFormat bindyGRUI = new BindyFixedLengthDataFormat(GRUI.class);
        DataFormat bindyADRT = new BindyFixedLengthDataFormat(ADTR.class);

        this.logger.info(getCurrentWorkingDirectory());


        // Split each line of the file as string
        from("file://" + getCurrentWorkingDirectory() + "?noop=true")
                .routeId("Splitter")
                .marshal().string("UTF-8")
                .split(body().tokenize(System.lineSeparator()))
                .streaming()
                // Filter away all {"IHF","IAF","RAF"} records
                .filter().simple("${bean:manageRouteBean?method=shouldProcess}")
                // Send to next step
                .to("seda:splitByProductType");

        // For each line find the correct product type GRUI or ADRT and send to next step
        from("seda:splitByProductType")
                .routeId("ProductSplitter")
                .choice()
                .when(method(RecordFilterBean.class, "getProductType").isEqualTo("GRUI"))
                .to("seda:GRUIConverter")
                .when(method(RecordFilterBean.class, "getProductType").isEqualTo("ADRT"))
                .to("seda:ADTRConverter")
                .otherwise()
                .log("***********************")
                .end();

        // Properly parse GRUI records
        from("seda:GRUIConverter")
                .routeId("GRUIConverter")
                .unmarshal(bindyGRUI)
                .bean(RecordFilterBean.class, "stampGRUIHeader(${exchange})")
                .to("seda:finalMessage");

        // Properly parse ADRT records
        from("seda:ADTRConverter")
                .routeId("ADTRConverter")
                .unmarshal(bindyADRT)
                .bean(RecordFilterBean.class, "stampADTRHeader(${exchange})")
                .to("seda:finalMessage");

        // Join these records
        from("seda:finalMessage")
                .routeId("finalMessage")
                .aggregate(header("egenId"), new CombineInfoStrategy()).completionTimeout(100).completionTimeoutCheckerInterval(10)
//                .convertBodyTo(String.class)
                .log(LoggingLevel.INFO, logger, "${headers}");
    }

    private String getCurrentWorkingDirectory() {
        return System.getProperty("user.dir") + "/src/main/resources/data";
    }
}
