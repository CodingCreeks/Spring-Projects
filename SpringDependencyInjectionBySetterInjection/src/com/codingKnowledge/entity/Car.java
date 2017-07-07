package com.codingKnowledge.entity;

public class Car {

	int modelYear;
	Engine engine;

	public Car(int modelYear, Engine engine) {
		this.modelYear = modelYear;
		this.engine = engine;
	}

	public void printCar() {
		System.out.println("Model Year: " + modelYear + "\tEngine: " + engine.printEngine());
	}

}
