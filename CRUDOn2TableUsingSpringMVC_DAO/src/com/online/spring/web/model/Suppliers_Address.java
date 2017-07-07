package com.online.spring.web.model;

public class Suppliers_Address {

	int supplierID;
	String companyName;
	String contactName;
	String contactJobTitle;
	String username;
	String password;

	int addsupplierID;
	String address;
	String city;
	String state;
	String country;
	int postalcode;
	String phoneoffice;
	String fax;
	String email;

	public Suppliers_Address() {
	}


	public Suppliers_Address(int supplierID, String companyName, String contactName, String contactJobTitle,
			String username, String password, int addsupplierID, String address, String city, String state,
			String country, int postalcode, String phoneoffice, String fax, String email) {
		this.supplierID = supplierID;
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactJobTitle = contactJobTitle;
		this.username = username;
		this.password = password;
		this.addsupplierID = addsupplierID;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalcode = postalcode;
		this.phoneoffice = phoneoffice;
		this.fax = fax;
		this.email = email;
	}


	public int getSupplierID() {
		return supplierID;
	}


	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public String getContactJobTitle() {
		return contactJobTitle;
	}


	public void setContactJobTitle(String contactJobTitle) {
		this.contactJobTitle = contactJobTitle;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public String getPhoneoffice() {
		return phoneoffice;
	}


	public void setPhoneoffice(String phoneoffice) {
		this.phoneoffice = phoneoffice;
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
		return "Suppliers_Address [supplierID=" + supplierID + ", companyName=" + companyName + ", contactName="
				+ contactName + ", contactJobTitle=" + contactJobTitle + ", username=" + username + ", password="
				+ password + ", addsupplierID=" + addsupplierID + ", address=" + address + ", city=" + city + ", state="
				+ state + ", country=" + country + ", postalcode=" + postalcode + ", phoneoffice=" + phoneoffice
				+ ", fax=" + fax + ", email=" + email + "]";
	}
	
	
}
