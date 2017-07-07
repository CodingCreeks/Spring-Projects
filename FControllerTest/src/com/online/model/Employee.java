package com.online.model;

public class Employee {
	int eno;
	String ename;
	String edesignation;
	String egender;
	double esalary;
	String eusername;
	String epassword;

	public Employee() {
	}

	public Employee(int eno, String ename, String edesignation, String egender, double esal, String eusername,
			String epassword) {
		this.eno = eno;
		this.ename = ename;
		this.edesignation = edesignation;
		this.egender = egender;
		this.esalary = esal;
		this.eusername = eusername;
		this.epassword = epassword;
	}

	public int getEno() { // to pull data
		return eno;
	}

	public void setEno(int eno) { // to store data
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdesignation() {
		return edesignation;
	}

	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}

	public String getEgender() {
		return egender;
	}

	public void setEgender(String gender) {
		this.egender = gender;
	}

	public double getEsal() {
		return esalary;
	}

	public void setEsal(double esal) {
		this.esalary = esal;
	}

	public String getEusername() {
		return eusername;
	}

	public void setEusername(String username) {
		this.eusername = username;
	}

	public String getEpassword() {
		return epassword;
	}

	public void setEpassword(String password) {
		this.epassword = password;
	}
	public void getEpassword(String password) {
		this.epassword = password;
	}

}
