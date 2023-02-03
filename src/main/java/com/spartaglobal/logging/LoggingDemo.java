package com.spartaglobal.logging;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LoggingDemo {

    // create a logger specific to this class

    // private static Logger logger = LogManager.getLogger(LoggingDemo.class);

    // the name can be any string, use the same name for shared loggers
    private static Logger logger = LogManager.getLogger("My Sparta App");

    public static void main(String[] args) {
        logger.info(" This is an information message");
        logger.error("This is an error message"); // second highest
        logger.debug ("This is a debug message");

        int result = 0;
        try {
            result = divide(1, 0);
            logger.info("Successful integer division calculation");
        }
        catch(ArithmeticException e) {
            logger.catching(e);
            logger.warn("Except thrown ");
        }

    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0 ) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

}
