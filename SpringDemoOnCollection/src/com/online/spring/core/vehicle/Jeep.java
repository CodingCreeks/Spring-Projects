package com.online.spring.core.vehicle;


import com.online.spring.core.parts.Parts;
import com.online.spring.core.property.Properties;


public class Jeep {
	String jeep;
	Properties properties;
	Parts parts;
	
	public Jeep() {
	}

	public Jeep(String jeep, Properties properties, Parts parts) {
		this.jeep = jeep;
		this.properties = properties;
		this.parts = parts;
	}

	public String getCar() {
		return jeep;
	}

	public Properties getPr() {
		return properties;
	}

	public Parts getParts() {
		return parts;
	}
	public void printjeep(){
		System.out.println("Car :"+jeep);
		properties.printpropety();
		parts.printParts();
	}
}
