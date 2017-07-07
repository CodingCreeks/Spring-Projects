package com.online.hibernate.entity.Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	
	@Column
	String address;
	
	@Column
	String pincode;
	
	public Address() {
	}
	public Address(String address, String pincode) {
		super();
		this.address = address;
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}