package com.online.spring.core.property;

public class Properties {

	String model;
	String color;
	String make;
	int yofm;

	public Properties() {
	}

	public Properties(String model, String color, String make, int yofm) {
		this.model = model;
		this.color = color;
		this.make = make;
		this.yofm = yofm;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setYofm(int yofm) {
		this.yofm = yofm;
	}

	public void printpropety() {
		System.out.println("Model :" + model);
		System.out.println("Color :" + color);
		System.out.println("Make :" + make);
		System.out.println("Year :" + yofm);
	}
}
