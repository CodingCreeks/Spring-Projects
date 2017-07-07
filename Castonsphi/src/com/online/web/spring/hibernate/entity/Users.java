package com.online.web.spring.hibernate.entity;

import java.util.Set;

public class Users {
	int id;
	String user;
	String password;

	Set<Inventory> inventry;

	public Users() {
	}

	public Users(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public Users(int id, String user, String password, Set<Inventory> inventry) {
		this.id = id;
		this.user = user;
		this.password = password;
		this.inventry = inventry;
	}

	public Users(String user, String password, Set<Inventory> inventry) {
		this.user = user;
		this.password = password;
		this.inventry = inventry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Inventory> getInventry() {
		return inventry;
	}

	public void setInventry(Set<Inventory> inventry) {
		this.inventry = inventry;
	}
}
