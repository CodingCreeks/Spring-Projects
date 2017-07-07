package com.codingKnowledge.model;

public class AppUser {

	String name;
	int age;
	String email;

	public AppUser() {
	}

	public AppUser(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Name : " + name + "\tAge : " + age + "\tEmail : " + email;
	}
}