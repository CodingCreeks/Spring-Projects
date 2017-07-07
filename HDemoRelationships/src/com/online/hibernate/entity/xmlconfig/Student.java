package com.online.hibernate.entity.xmlconfig;

public class Student {
	int id;
	String sname;
	String course;
	Address address;

	public Student() {
	}

	public Student(int id, String sname, String course, Address address) {
		this.id = id;
		this.sname = sname;
		this.course = course;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int sid) {
		this.id = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
