package ps.camel.no;

import org.apache.camel.main.Main;
import org.apache.camel.main.MainListenerSupport;
import org.apache.camel.main.MainSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ps.camel.no.beans.RecordFilterBean;
import ps.camel.no.routes.FileRouteBuilder;

public final class Application {

    public static void main(String args[]){
        final Main main = new Main();
        main.addMainListener(new Application.Events());
        main.bind("manageRouteBean", new RecordFilterBean());
        // add camel routes
        main.addRouteBuilder(new FileRouteBuilder());
        try {
            main.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class Events extends MainListenerSupport {
        private Logger logger;

        private Events() {
            this.logger = LoggerFactory.getLogger(Application.Events.class);
        }

        public void afterStart(MainSupport main) {
            this.logger.info("Camel app is now started!");
        }

        public void beforeStop(MainSupport main) {
            this.logger.info("Camel app is shutting down!");
        }
    }
}
