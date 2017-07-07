package com.online.spring.core.collection;

public class Car {
	int cno;
	String cname;

	public Car() {
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return (cno+"," +cname +"\n");
	}

}