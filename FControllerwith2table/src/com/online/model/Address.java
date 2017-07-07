package com.online.model;

public class Address {
	
	int aid;
	String street;
	String city; 
	String state;
	int pincode;
	String contact;
	String email;
	
	public Address() {
	}

	public Address(int aid, String street, String city, String state, int pincode, String contact,
			String email) {
		
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.contact = contact;
		this.email = email;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid=aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
