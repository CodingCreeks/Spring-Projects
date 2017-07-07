package com.codingKnowledge.entity;

import javax.annotation.Resource;

public class Car {

	/* @Resouce will use the Dependency Injection ByName */
	@Resource
	private Engine engine;

	public void printCar() {
		System.out.println("Car with '" + engine.getEngineName()+"' Engines");
	}

}
