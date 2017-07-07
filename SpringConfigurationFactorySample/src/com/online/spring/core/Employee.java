package com.online.spring.core;

import java.util.Set;

public class Employee {

	int empid;
	String empname;
	Set<Employee> empset;
	
	
	public Employee() {
	}

	public Employee(int empId, String empName) {
		this.empid = empId;
		this.empname = empName;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setEmpset(Set<Employee> empset) {
		this.empset = empset;
	}

	


	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}

	public void printEmployee() {
		System.out.println("Emplyee ID: " + empid + "\nEmployee Name: " + empname);
	}

	public void printEmployeeset() {
		System.out.println(empset);
	}

}
