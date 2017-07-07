package com.codingKnowledge.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	int modelYear;

	@Qualifier(value="e2")
	@Autowired
	Engine engine;

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public void printCar() {
		System.out.println("Model Year: " + modelYear + "\tEngine: " + engine.printEngine());
	}

}
