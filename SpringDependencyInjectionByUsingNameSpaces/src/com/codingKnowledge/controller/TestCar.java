package com.codingKnowledge.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codingKnowledge.entity.Car;

public class TestCar {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Dependency Injection by 'p' NameSpace");
		Car car1 = (Car) context.getBean("c1");
		car1.printCar();
		
		System.out.println("Dependency Injection by 'c' NameSpace");
		Car car2 = (Car) context.getBean("c2");
		car2.printCar();
	}
}
