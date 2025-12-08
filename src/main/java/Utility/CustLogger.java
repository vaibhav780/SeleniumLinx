package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.bidi.log.Log;

public class CustLogger {

    private static Logger logger = (Logger) LogManager.getLogger();



    public static void Info(String message){
        logger.info(message);
    }

    public static void WARN(String message){
        logger.warn(message);
    }
    public static void DEBUG(String message){
        logger.debug(message);
    }
    public static void FATAL(String message){
        logger.fatal(message);
    }
    public static void ERROR(String message){
        logger.error(message);
    }
}
