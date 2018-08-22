package ps.camel.no.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.fixed.BindyFixedLengthDataFormat;
import org.apache.camel.spi.DataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ps.camel.no.beans.RecordFilterBean;
import ps.camel.no.model.Basic;

public class FileRouteBuilder extends RouteBuilder {
    Logger logger = LoggerFactory.getLogger(FileRouteBuilder.class);

    @Override
    public void configure() throws Exception {

        DataFormat bindy = new BindyFixedLengthDataFormat(Basic.class);

        this.logger.info(getCurrentWorkingDirectory());


        // Split each line of the file as string
        from("file://" + getCurrentWorkingDirectory() + "?noop=true")
                .marshal().string("UTF-8")
                .split(body().tokenize(System.lineSeparator()))
                .streaming()
                .filter().simple("${bean:manageRouteBean?method=shouldProcess}")
                .to("seda:splitByProductType");


        from("seda:splitByProductType")
                // choice
                .choice()
                // when GRUI then to seda:joiner
                .when(method(RecordFilterBean.class, "getProductType").isEqualTo("GRUI")).to("seda:aggregator")
                // when ADTR then to seda:joiner
                // otherwise end
                .otherwise()
                // then aggregate using some keys
                // create a common message
                // push to target

//                .unmarshal(bindy)
//                .convertBodyTo(String.class)
//                .routeId("fileRouteBuider")
//                .log(LoggingLevel.INFO, logger, "Processing file ${file:name}")
//                .log(LoggingLevel.INFO, logger, "content ${body}")
                .log("***********************")
                .end();

        from("seda:aggregator")
                .unmarshal(bindy)
                .convertBodyTo(String.class)
                .log(LoggingLevel.INFO, logger, "Hello ${body}");
    }

    private String getCurrentWorkingDirectory() {
        return System.getProperty("user.dir") + "/src/main/resources/data";
    }
}
