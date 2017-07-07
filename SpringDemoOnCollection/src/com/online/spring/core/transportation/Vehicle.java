package com.online.spring.core.transportation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.spring.core.vehicle.Car;
import com.online.spring.core.vehicle.Jeep;

public class Vehicle {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("transportation.xml");
		
		Car car=(Car) context.getBean("car");
		car.printcar();
		System.out.println("********************************************************");
		Jeep jeep=(Jeep) context.getBean("jeep");
		jeep.printjeep();
	}
}
