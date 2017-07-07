package com.vehicle;

public class Car extends Vehicle {

	
	public Car(String steering, int gear, int speed) {
		super(steering, gear, speed);
	}
	
	public void steer(){
		System.out.println("You can steer the Steering of the Car...");
	}
	
	public void changegear(){
		System.out.println("You can chage the gears of the Car ");
	}

	
}
