package com.online.spring.core;

import java.util.List;
import java.util.Map;

public class Company {

	int cno;
	String cname;
	Employee employee;

	List<String> cmplist;
	Map<String, Employee> map;

	

	public List<String> getCmplist() {
		return cmplist;
	}

	public void setCmplist(List<String> cmplist) {
		this.cmplist = cmplist;
	}

	public Company() {
	}

	public Company(int cno, String cname, Employee employee) {
		this.cno = cno;
		this.cname = cname;
		this.employee = employee;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void setMap(Map<String, Employee> map) {
		this.map = map;
	}

	public void printCompany() {
		System.out.println("Company Number: " + cno + "\nCompany Name: " + cname);
	}

	public void printCompanylist() {
		System.out.println(cmplist);
	}

	public void printmap(){
		System.out.println(map);
	}

}
