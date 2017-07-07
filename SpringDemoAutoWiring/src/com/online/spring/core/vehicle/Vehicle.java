package com.online.spring.core.vehicle;

public class Vehicle {
	String car;
	Driver driver;

	public Vehicle() {
	}

	public void setCar(String car) {
		this.car = car;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void printVehicle() {
		System.out.println("Vehicle :" + car);
		driver.printDriver();
	}
}
