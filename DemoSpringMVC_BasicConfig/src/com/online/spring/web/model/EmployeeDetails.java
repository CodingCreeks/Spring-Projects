package com.online.spring.web.model;

public class EmployeeDetails {
	
	int eno;
	String ename;
	String edesignation; 
	String egender;
	double esalary;
	String eusername; 
	String epassword;
	int eaid;
	
	public EmployeeDetails() {
	}
	
	public EmployeeDetails(int eno, String ename, String edesignation, String egender, double esalary, String eusername,
			String epassword, int eaid) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.edesignation = edesignation;
		this.egender = egender;
		this.esalary = esalary;
		this.eusername = eusername;
		this.epassword = epassword;
		this.eaid = eaid;
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
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
	public void setEgender(String egender) {
		this.egender = egender;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public String getEusername() {
		return eusername;
	}
	public void setEusername(String eusername) {
		this.eusername = eusername;
	}
	public String getEpassword() {
		return epassword;
	}
	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}
	public int getEaid() {
		return eaid;
	}
	public void setEaid(int eaid) {
		this.eaid = eaid;
	}
	
}
