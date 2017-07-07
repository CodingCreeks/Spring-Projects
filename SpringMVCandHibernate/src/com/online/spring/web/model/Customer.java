package com.online.spring.web.model;

public class Customer {

	int customerId;
	String customerfname;
	String customerlname;
	String customergender;
	String customerphone;
	String customeremail;
	Address address;

	public Customer() {
	}

	public Customer(String customerfname, String customerlname, String customergender, String customerphone,
			String customeremail, Address address) {
		this.customerfname = customerfname;
		this.customerlname = customerlname;
		this.customergender = customergender;
		this.customerphone = customerphone;
		this.customeremail = customeremail;
		this.address = address;
	}

	public Customer(int customerId, String customerfname, String customerlname, String customergender, String customerphone,
			String customeremail, Address address) {
		this.customerId = customerId;
		this.customerfname = customerfname;
		this.customerlname = customerlname;
		this.customergender = customergender;
		this.customerphone = customerphone;
		this.customeremail = customeremail;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerfname() {
		return customerfname;
	}

	public void setCustomerfname(String customerfname) {
		this.customerfname = customerfname;
	}

	public String getCustomerlname() {
		return customerlname;
	}

	public void setCustomerlname(String customerlname) {
		this.customerlname = customerlname;
	}

	public String getCustomergender() {
		return customergender;
	}

	public void setCustomergender(String customergender) {
		this.customergender = customergender;
	}

	public String getCustomerphone() {
		return customerphone;
	}

	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
