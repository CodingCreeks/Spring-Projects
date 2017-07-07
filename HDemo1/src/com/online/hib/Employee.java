package com.online.hib;

public class Employee {

	int eno;
	String fname;
	String lname;

	public Employee() {
	}

	public Employee(int eno, String fname, String lname) {
		this.eno = eno;
		this.fname = fname;
		this.lname = lname;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
