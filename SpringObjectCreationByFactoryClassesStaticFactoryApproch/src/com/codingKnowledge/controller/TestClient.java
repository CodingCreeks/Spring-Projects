package com.codingKnowledge.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.codingKnowledge.entity.Vendor;

public class TestClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Vendor v = (Vendor) context.getBean("vf");
		v.startProject();
	}
}
