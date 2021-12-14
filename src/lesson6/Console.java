package lesson6;

import org.apache.log4j.Logger;

public class Console {
    Logger logger = Logger.getLogger(getClass());
    void printText() {
        logger.info("Test");
    }
}
