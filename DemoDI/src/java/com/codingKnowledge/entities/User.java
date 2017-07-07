package com.codingKnowledge.entities;

import org.springframework.beans.factory.annotation.Required;

public class User {
	int no;
	String name;
	String email;
	Address address;

	public User() {
	}

	public User(int no, String name, String email, Address address) {
		this.no = no;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Required
	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printUserModel() {
		System.out.println("Number: " + no + "\tName: " + name + "\tEmail: " + email + address);
	}

}
