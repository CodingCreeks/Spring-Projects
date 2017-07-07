package com.online.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImpCompany {
	static ApplicationContext context;
	static{
		context=new ClassPathXmlApplicationContext("company.xml");
	}

	public static void main(String[] args) {
		
		Company comp;
		comp=(Company) context.getBean("cmp");
		comp.print();
	}

}
