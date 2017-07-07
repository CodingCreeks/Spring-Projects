package com.online.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	String car;
	Driver driver;

	public Vehicle() {
	}

	@Value("BMW 2015")
	public void setCar(String car) {
		this.car = car;
	}

	@Autowired
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void printVehicle() {
		System.out.println("Vehicle :" + car);
		driver.printDriver();
	}
}
