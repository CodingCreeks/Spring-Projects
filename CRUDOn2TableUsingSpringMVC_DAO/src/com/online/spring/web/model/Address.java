package com.online.spring.web.model;

public class Address {

	int addsupplierID;
	String address;
	String city;
	String state;
	String country;
	int postalcode;
	String phoneOfficce;
	String fax;
	String email;

	public Address() {
	}

	public Address(int addsupplierID, String address, String city, String state, String country, int postalcode,
			String phoneOfficce, String fax, String email) {
		this.addsupplierID = addsupplierID;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalcode = postalcode;
		this.phoneOfficce = phoneOfficce;
		this.fax = fax;
		this.email = email;
	}

	public int getAddsupplierID() {
		return addsupplierID;
	}

	public void setAddsupplierID(int addsupplierID) {
		this.addsupplierID = addsupplierID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public String getPhoneOfficce() {
		return phoneOfficce;
	}

	public void setPhoneOfficce(String phoneOfficce) {
		this.phoneOfficce = phoneOfficce;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Address [addsupplierID=" + addsupplierID + ", address=" + address + ", city=" + city + ", state="
				+ state + ", country=" + country + ", postalcode=" + postalcode + ", phoneOfficce=" + phoneOfficce
				+ ", fax=" + fax + ", email=" + email + "]";
	}
	
}
