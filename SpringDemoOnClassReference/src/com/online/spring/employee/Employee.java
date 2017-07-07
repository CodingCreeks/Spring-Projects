package com.online.spring.employee;

import com.online.spring.address.reference.Address;

public class Employee {
	int eno;
	String ename;
	String edesignation;
	String egender;
	String esalary;
	String eusername;
	String epassword;
	Address address;
	
	public Employee() {
	}

	public Employee(int eno, String ename, String edesignation, String egender, String esalary, String eusername, String epassword,
			Address address) {
		this.eno = eno;
		this.ename = ename;
		this.edesignation = edesignation;
		this.egender = egender;
		this.esalary = esalary;
		this.eusername = eusername;
		this.epassword = epassword;
		this.address = address;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	public void setEusername(String eusername) {
		this.eusername = eusername;
	}

	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}
	
	public void setEgender(String egender) {
		this.egender = egender;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEno() {
		return eno;
	}

	public String getEname() {
		return ename;
	}

	public String getEdesignation() {
		return edesignation;
	}

	public String getEsalary() {
		return esalary;
	}

	public String getEusername() {
		return eusername;
	}

	public String getEpassword() {
		return epassword;
	}
	
	public String getEgender() {
		return egender;
	}

	public Address getAddress() {
		return address;
	}
	
	public void print(){
		System.out.println("Employee No : " +getEno());
		System.out.println("Employee Name : " +getEname());
		System.out.println("Employee Designantion : " +getEdesignation());
		System.out.println("Employee Gender : " +getEgender());
		System.out.println("Employee Salary : " +getEsalary());
		System.out.println("Employee Username : " +getEusername());
		System.out.println("Employee Password : "+getEpassword());
		address.print();

	}
}
