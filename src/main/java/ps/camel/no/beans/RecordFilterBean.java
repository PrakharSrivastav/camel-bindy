package ps.camel.no.beans;

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
        System.out.println("Body is :: " + body);
        final String ret = body.substring(19,23);
        System.out.println("Return  is :: " + ret);

        return ret;
//        System.out.println(recordId);
//        if(Arrays.asList(skip).contains(recordId)) return false;
//        return true;
    }
}
