package com.online.spring.core.town;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.online.spring.core.shopping.SuperMarket;

@Component
public class GerogiaTown {
	static ApplicationContext context;
	static {
		context=new ClassPathXmlApplicationContext("walmart.xml");
	}

	public static void main(String[] args) {
		SuperMarket supermarket;
		supermarket=(SuperMarket) context.getBean("shopper1");
		supermarket.printSuperMarket();

	}

}
