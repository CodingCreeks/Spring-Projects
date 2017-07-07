package com.online.spring.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Address {

	@Column
	String street;
	@Column
	String city;
	@Column
	String state;
	@Column
	String country;
	@Column
	String zipcode;

	public Address() {
	}

	public Address(String street, String city, String state, String country, String zipcode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
