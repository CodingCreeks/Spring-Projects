package com.online.web.spring.hibernate.entity;

/*
 * Column Name 	Column Type 								Description
 * 
*  	id 		smallint 	unsigned not null auto increment 	Unique id for items in this table (primary key)
*	name 	tinytext 	not null 							Vendor's (company) name.
*	address tinytext 	Vendor's 							mailing address.
*	url 	tinytext 	Vendor's 							website URL.
*	phone 	tinytext 	Vendor's 							phone number.
*	fax 	tinytext 	Vendor's 							fax number.
*	email 	tinytext 	Vendor's 							email address.
 */

public class Vendordetails {
	int id;
	String name;
	String address;
	String url;
	String phone;
	String fax;
	String email;

	public Vendordetails() {
	}

	public Vendordetails(String name, String address, String url, String phone, String fax, String email) {
		this.name = name;
		this.address = address;
		this.url = url;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
}
