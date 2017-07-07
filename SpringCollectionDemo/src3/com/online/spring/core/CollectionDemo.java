package com.online.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.spring.core.collection.Setlistdemo;

public class CollectionDemo {

	static ApplicationContext context;
	static {
		context = new ClassPathXmlApplicationContext("collection.xml");
	}

	public static void main(String[] args) {
		Setlistdemo sld;
		sld = (Setlistdemo) context.getBean("collectdata");
		sld.listPrint();
		sld.carPrint();
		System.out.println("********************************");
		sld.mymapprint();
	}

}
