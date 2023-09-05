package com.prowings;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j {
	
	public static final Logger logger = LoggerFactory.getLogger(TestLog4j.class);
//	    public static final Logger logger = LogManager.getLogger(TestLog4j.class);
	
	public static void main(String[] args) {
		
		logger.info("An INFO message");
        logger.debug("A DEBUB message");
        logger.trace("A TRACE message");
        logger.warn("A WARN message");
        logger.error("A ERROR message");
//        logger.fatal("A FATAL message");
		
	}

}
