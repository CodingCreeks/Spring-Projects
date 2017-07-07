package com.vehicle;

public class Vehicle {

	String stering;
	int gear;
	int speed;
	
	public Vehicle(String stering, int gear, int speed) {
		this.stering = stering;
		this.gear = gear;
		this.speed = speed;
	}

	public String getStering() {
		return stering;
	}

	public int getGear() {
		return gear;
	}

	public int getSpeed() {
		return speed;
	}
}
