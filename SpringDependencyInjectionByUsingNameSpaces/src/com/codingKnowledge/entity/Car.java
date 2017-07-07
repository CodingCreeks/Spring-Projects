package com.codingKnowledge.entity;

public class Car {

	int modelYear;
	Engine engine;

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(int modelYear, Engine engine) {
		this.modelYear = modelYear;
		this.engine = engine;
	}

	public void printCar() {
		System.out.println("Model Year: " + modelYear + "\tEngine: " + engine.printEngine());
	}

}
