package com.epam.loggingdemo;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calculateinterest {

	public static void main(String[] args) {
		
		final Logger LOGGER =LogManager.getLogger(App.class);
		interest In=new interest();
		Scanner sc=new Scanner(System.in);
		double principle,time,rate;
		LOGGER.info("enter principle amount");
		principle=sc.nextDouble();
		LOGGER.info("enter time period");
		time=sc.nextDouble();
		LOGGER.info("enter rate of interest");
		rate=sc.nextDouble();
		double simple=In.simpleInterest(principle, time, rate);
		double compound=In.compoundInterest(principle, time, rate);
		LOGGER.info("simple interest is"+simple);
		LOGGER.info("compound interest is"+compound);
		

	}

}
