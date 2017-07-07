package com.online.model;

public class Employee {

	int eNo;
	String eName;
	String eGender;
	Double eSalary;
	String eDesignation;
	int aId;
	
	public Employee(int eNo, String eName, String eGender, Double eSalary, String eDesignation, int aId) {
		this.eNo = eNo;
		this.eName = eName;
		this.eGender = eGender;
		this.eSalary = eSalary;
		this.eDesignation = eDesignation;
		this.aId = aId;
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
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}

}
