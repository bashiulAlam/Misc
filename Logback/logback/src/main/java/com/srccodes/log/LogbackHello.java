package com.srccodes.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Abhijit Ghosh
 * @version 1.0
 */
public class LogbackHello {
    private static final Logger slf4jLogger = LoggerFactory.getLogger(LogbackHello.class);


    /**
     * @param args
     */
    public static void main(String[] args) {
    	slf4jLogger.trace("Hello World!");
    	
    	String name = "Abhijit";
    	slf4jLogger.debug("Hi, {}", name);
    	slf4jLogger.info("Welcome to the HelloWorld example of Logback.");
    	slf4jLogger.warn("Dummy warning message.");
    	slf4jLogger.error("Dummy error message.");
    }
}