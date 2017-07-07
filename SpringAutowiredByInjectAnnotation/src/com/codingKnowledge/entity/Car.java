package com.codingKnowledge.entity;

import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	/* @Inject will use the Dependency Injection ByName type */
	@Qualifier(value="e2")
	/*@Inject*/
	private Engine engine;

	public void printCar() {
		System.out.println("Car with '" + engine.getEngineName()+"' Engines");
	}

}
