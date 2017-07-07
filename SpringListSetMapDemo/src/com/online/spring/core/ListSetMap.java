package com.online.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.spring.core.mycompany.Company;

public class ListSetMap {
	static ApplicationContext context;
static{
	context=new ClassPathXmlApplicationContext("listsetmap.xml");
}
	public static void main(String[] args) {
		Company company;
		company=(Company) context.getBean("listbean");
		company.printcompany();
	}
	
}
