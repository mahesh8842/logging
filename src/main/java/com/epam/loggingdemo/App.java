package com.epam.loggingdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	final Logger LOGGER =LogManager.getLogger(App.class);
    	LOGGER.info("hello world");
    	
        
    }
}
