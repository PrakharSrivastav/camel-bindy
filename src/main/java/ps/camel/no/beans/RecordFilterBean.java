package ps.camel.no.beans;

import org.apache.camel.Exchange;
import org.apache.camel.language.Bean;
import ps.camel.no.model.ADTR;
import ps.camel.no.model.BaseInfo;
import ps.camel.no.model.GRUI;

import java.util.Arrays;

public class RecordFilterBean {

    private static String[] skip = {"IHF","IAF","RAF"};
    private static String[] products = {"GRUI"};
    public Boolean shouldProcess(final String string){
        final String recordId = string.substring(16,19);
//        System.out.println(recordId);
        if(Arrays.asList(skip).contains(recordId)) return false;
        return true;
    }


    public String getProductType(final String body){
        return body.substring(19,23);
//        System.out.println("Body is :: " + body);
//        final String ret = body.substring(19,23);
//        System.out.println("Return  is :: " + ret);
//
//        return ret;
//        System.out.println(recordId);
//        if(Arrays.asList(skip).contains(recordId)) return false;
//        return true;
    }


    public void stampADTRHeader(Exchange exchange){
        final BaseInfo obj = exchange.getIn().getBody(ADTR.class);
        exchange.getIn().setHeader("egenId",((ADTR) obj).getEgenId());
//        return exchange;
    }

    public void stampGRUIHeader(Exchange exchange){
        final BaseInfo obj = exchange.getIn().getBody(GRUI.class);
        exchange.getIn().setHeader("egenId",((GRUI) obj).getEgenId());
//        return exchange;
    }
}
