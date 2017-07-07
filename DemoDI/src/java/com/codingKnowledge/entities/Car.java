package com.codingKnowledge.entities;

public class Car {

	String name[];
	Engine engine[];

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public Engine[] getEngine() {
		return engine;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public void print() {
		for (String n : name)
			System.out.println("Car Name: " + n);
		for (Engine e : engine)
			System.out.println("Eninge: " + e.getModelYear());
	}

}
