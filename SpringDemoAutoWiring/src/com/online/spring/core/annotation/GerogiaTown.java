package com.online.spring.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class GerogiaTown {
	static ApplicationContext context;
	static {
		context=new ClassPathXmlApplicationContext("gerogiaTown.xml");
	}

	public static void main(String[] args) {
		SuperMarket supermarket;
		supermarket=(SuperMarket) context.getBean(SuperMarket.class);
		supermarket.printSuperMarket();

	}

}
