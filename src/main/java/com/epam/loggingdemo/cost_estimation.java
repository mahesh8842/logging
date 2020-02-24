package com.epam.loggingdemo;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class cost_estimation {
	public static void main(String[] args) {
		final Logger LOGGER =LogManager.getLogger(App.class);
		int no_of_feets;
		constructioncost cc=new constructioncost();
		Scanner sc=new Scanner(System.in);
		LOGGER.info("enter the no of feets to be estimated");
		no_of_feets=sc.nextInt();
		LOGGER.info("select the materials form the following");
		LOGGER.info("1 for standard" +"\n"+ "2 for above standard"+"\n"+"3 for high standard"+"\n"+"4 for fully automated");
		LOGGER.info("enter ypur response");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:LOGGER.info("cost estimated is"+cc.Standard(no_of_feets));break;
		case 2:LOGGER.info("cost estimated is"+cc.Above_Standard(no_of_feets));break;
		case 3:LOGGER.info("cost estimated is"+cc.High_Standard(no_of_feets));break;
		case 4:LOGGER.info("cost estimated is"+cc.Automated(no_of_feets));break;
		}

}}
