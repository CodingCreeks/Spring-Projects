package com.online.spring.address.reference;

public class Address {
	
	String street;
	String city;
	String state;
	String country;
	String pincode;
	public Address() {
	}
	
	public Address(String street, String city, String state, String country, String pincode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getPincode() {
		return pincode;
	}
	
	public void print() {
		System.out.println("Employee Address : " +street +"," +city +"," +state +","+country +"," +pincode);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	
}
