package com.codingKnowledge.entity;

public class Engine {
	String engineType;

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public Engine(String engineType) {
		super();
		this.engineType = engineType;
	}

	public String printEngine() {
		return engineType;
	}

}
