package com.online.spring.web.core;

public class Company {

	String user;
	String password;

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public Company() {
	}

	public Company(String user, String password) {
		this.user = user;
		this.password = password;
	}

}
