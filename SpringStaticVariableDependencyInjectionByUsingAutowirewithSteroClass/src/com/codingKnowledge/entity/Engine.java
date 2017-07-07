package com.codingKnowledge.entity;

public class Engine {

	private static String engineType;

	public static void setEngineType(String engineType) {
		Engine.engineType = engineType;
	}

	public static String getEngineType() {
		return engineType;
	}

	/*public void printEngine() {
		System.out.println("Engine: " + engineType);
	}*/
}
