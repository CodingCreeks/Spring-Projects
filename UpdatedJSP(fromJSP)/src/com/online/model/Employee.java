package com.online.model;

public class Employee {
	
	public Employee() { 	
	}
	
	int eNo;
	String eName;
	String eGender;
	String eDesignation;
	Double eSalary;
	String ePassword;
	
	public Employee(int eNo, String eName, String eGender, String eDesignation, Double eSalary, String ePassword) {
		this.eNo = eNo;
		this.eName = eName;
		this.eGender = eGender;
		this.eDesignation = eDesignation;
		this.eSalary = eSalary;
		this.ePassword = ePassword;
	}
	
	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteGender() {
		return eGender;
	}

	public void seteGender(String eGender) {
		this.eGender = eGender;
	}

	public String geteDesignation() {
		return eDesignation;
	}

	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

	public Double geteSalary() {
		return eSalary;
	}

	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}

	public String getePassword() {
		return ePassword;
	}

	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}
}
