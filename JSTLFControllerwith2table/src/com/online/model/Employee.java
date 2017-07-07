package com.online.model;

public class Employee {
	int eno;
	String ename;
	String edesignation;
	String egender;
	double esalary;
	String eusername;
	String epassword;
	int eaid;

	public Employee() {
	}

	public Employee(int eno, String ename, String edesignation, String egender, double esalary, String eusername,
			String epassword, int eaid) {
		
		this.eno = eno;
		this.ename = ename;
		this.edesignation = edesignation;
		this.egender = egender;
		this.esalary = esalary;
		this.eusername = eusername;
		this.epassword = epassword;
		this.eaid = eaid;
		
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

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esal) {
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
	
	public int getEaid() {

		return eaid;
	}

	public void setEaid(int eaid) {
		this.eaid = eaid;
	}
}
