package com.codingKnowledge.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@SuppressWarnings("unused")
	@Autowired
	private static Engine engine;
	
	public void printCar() {
		System.out.println("Engine: " + Engine.getEngineType());
	}

}
