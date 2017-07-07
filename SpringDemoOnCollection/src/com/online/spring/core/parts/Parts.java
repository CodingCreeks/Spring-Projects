package com.online.spring.core.parts;

public class Parts {

	String engine;
	String dashborad;
	String seats;
	String wheels;
	String body;

	public Parts() {
	}

	public Parts(String engine, String dashborad, String seats, String wheels, String body) {
		this.engine = engine;
		this.dashborad = dashborad;
		this.seats = seats;
		this.wheels = wheels;
		this.body = body;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setDashborad(String dashborad) {
		this.dashborad = dashborad;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public void printParts(){
		System.out.println("Type of Engine:" +engine);
		System.out.println("Type of Dashborad:" +dashborad);
		System.out.println("Number of Seats:" +seats);
		System.out.println("Number of Wheels:" +wheels);
		System.out.println("Type of Body:" +body);
	}
}
