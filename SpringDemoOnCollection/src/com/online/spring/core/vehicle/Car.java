package com.online.spring.core.vehicle;

import com.online.spring.core.parts.Parts;
import com.online.spring.core.property.Properties;

public class Car {
	String car;
	Properties properties;
	Parts parts;
	
	public Car() {
	}

	public Car(String car, Properties properties, Parts parts) {
		this.car = car;
		this.properties = properties;
		this.parts = parts;
	}

	public String getCar() {
		return car;
	}

	public Properties getPr() {
		return properties;
	}

	public Parts getParts() {
		return parts;
	}
	public void printcar(){
		System.out.println("Car :"+car);
		properties.printpropety();
		parts.printParts();
	}
}
