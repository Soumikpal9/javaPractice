package com.javazz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	LOG.info("Here we go");
	    LOG.info("Hi");
    	LOG.info("Hello, World");
    }
}
