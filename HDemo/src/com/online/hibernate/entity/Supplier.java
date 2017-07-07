package com.online.hibernate.entity;

public class Supplier {

	int sno;
	String sname;
	String scompany;
	String saddress;

	public Supplier() {
	}

	public Supplier(String sname, String scompany, String saddress) {
		this.sname = sname;
		this.scompany = scompany;
		this.saddress = saddress;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScompany() {
		return scompany;
	}

	public void setScompany(String scompany) {
		this.scompany = scompany;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
}
