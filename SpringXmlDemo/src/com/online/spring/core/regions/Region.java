package com.online.spring.core.regions;

public class Region {
	String location;
	String state;
	public Region() {
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Region(String location, String state) {
		this.location = location;
		this.state = state;
	}
	public void regionPrint(){
		System.out.println("Location: "+location +","+"State: " +state);
	}
}
