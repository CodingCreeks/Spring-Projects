package com.online.spring.core.model;

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

	public void carprint() {
		System.out.println("Car Number:" + cno);
		System.out.println("Car Name:" + cname);
	}

	@Override
	public String toString() {
		return cno+"\t" +cname;
	}
}
