package com.codingKnowledge.entities;

import org.springframework.beans.factory.annotation.Required;

public class UserModel {
	int no;
	String name;
	String email;
	UserAddress address;

	public UserModel() {
	}

	public UserModel(int no, String name, String email, UserAddress address) {
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

	public void setAddress(UserAddress address) {
		this.address = address;
	}

	public void printUserModel() {
		System.out.println("Number: " + no + "\tName: " + name + "\tEmail: " + email + address);
	}

}
