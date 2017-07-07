package com.online.spring.web.model;

public class Suppliers {

	int supplierID;
	String companyName;
	String contactName;
	String contactJobTitle;
	String username;
	String password;

	public Suppliers() {
	}

	public Suppliers(int supplierID, String companyName, String contactName, String contactJobTitle, String username,
			String password) {
		this.supplierID = supplierID;
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactJobTitle = contactJobTitle;
		this.username = username;
		this.password = password;
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

	@Override
	public String toString() {
		return "Suppliers [supplierID=" + supplierID + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", contactJobTitle=" + contactJobTitle + ", username=" + username + ", password=" + password + "]";
	}
	
}
