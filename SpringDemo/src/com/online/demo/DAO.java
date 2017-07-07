package com.online.demo;

public class DAO {

	int i;
	int j;
	String str;

	public DAO() {
	}

	public DAO(int i, int j, String str) {
		System.out.println("In Three point constructor");
		this.i = i;
		this.j = j;
		this.str = str;
	}
	
	public void seti(int i) {
		this.i = i;
	}
	
	public void setJ(int j) {
		this.j = j;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void printDAO() {
		System.out.println("In DAO print method");
		System.out.println("The value of i:" +i);
		System.out.println("The value of j:" +j);
		System.out.println("The value of str:" +str);
	}
}
