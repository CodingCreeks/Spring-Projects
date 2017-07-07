package com.online.employeemodel;

import com.online.jdbcconnection.DBConnection;

public class Employee {

	int eNo;
	String eName;
	String eGender;
	Double eSalary;
	String eDesignation;
	String ePassword;
	
	public Employee() {
		DBConnection.createConnection();
	}
	public Employee(int eNo, String eName, String eGender, Double eSalary, String eDesignation, String ePassword) {
		
		this.eNo = eNo;
		this.eName = eName;
		this.eGender = eGender;
		this.eSalary = eSalary;
		this.eDesignation = eDesignation;
		this.ePassword= ePassword;
	
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
	public Double geteSalary() {
		return eSalary;
	}
	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}
	
	public String getePassword() {
		return ePassword;
	}
	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}
	
}
