import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebugLogger {
    public static Logger instance = null;
    private DebugLogger(){}
    public static Logger getInstance() {
        if(instance == null) {
            instance = LogManager.getLogger(DebugLogger.class);
        }
        return instance;
    }
    /*
    void OutLog() {
        Logger logger = LogManager.getLogger(DebugLogger.class);
        logger.trace("TraceMessage");
        logger.debug("DebugMessage");
        logger.info("InfoMessage {}!", "Hello Log4j2");
        logger.warn("WarnMessage {}!", "Hello Log4j2");
        logger.error("ErrorMessage");
        logger.fatal("FatalMessage");
        logger.info("Exception", new IllegalArgumentException("Oops!"));
    }
    */
}
