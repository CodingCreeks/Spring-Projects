package com.codingKnowledge.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codingKnowledge.entity.Car;

public class TestClient {

	public static void main(String[] args) throws Exception {

		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		Car c = (Car) ap.getBean("c");
		c.printCar();
	}
}
