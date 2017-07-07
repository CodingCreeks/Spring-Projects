package com.codingKnowledge.entities;

public class UserAddress {
	String city;
	String country;

	public UserAddress() {
	}

	public UserAddress(String city, String country) {
		this.city = city;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "\tCity: " + city + "\tCountry: " + country;
	}
}
