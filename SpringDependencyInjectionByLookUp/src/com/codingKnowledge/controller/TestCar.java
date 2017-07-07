package com.codingKnowledge.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codingKnowledge.entity.Bus;
import com.codingKnowledge.entity.Car;
import com.codingKnowledge.entity.Truck;

public class TestCar {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Car c1 = (Car) context.getBean("c");
		System.out.println("'Car' Interface Dependency injection (DI) by 'LookUp Method' ");
		System.out.println(c1.getClass().getCanonicalName());
		System.out.println(c1.myCarEngine().getEngineType());
		
		Bus b = (Bus) context.getBean("b");
		System.out.println("\n'Bus' abstract class Dependency injection (DI) by 'LookUp Method' ");
		System.out.println(b.getClass().getCanonicalName());
		System.out.println(b.myBusEngine().getEngineType());
		
		Truck t1= new Truck();
		System.out.println("\nExiting Truck class Implementation: "+t1.myTruckEngine().getEngineType());
		
		Truck t = (Truck) context.getBean("t");
		System.out.println("\n'Truck' Concrete class Dependency injection (DI) by 'LookUp Method' ");
		System.out.println(t.getClass().getCanonicalName());
		System.out.println(t.myTruckEngine().getEngineType());
	}
}
