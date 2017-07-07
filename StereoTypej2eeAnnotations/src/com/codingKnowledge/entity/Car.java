package com.codingKnowledge.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
/*@Named*/ //j2ee Annotations
public class Car {

	/* @Resouce will use the Dependency Injection ByName */
	/*@Resource*/ //j2ee Annotations
	@Autowired
	/*@Inject*/ //j2ee Annotations
	@Qualifier(value="e3")
	private Engine engine;

	public void printCar() {
		System.out.println("Car with '" + engine.getEngineName()+"' Engines");
	}

}
