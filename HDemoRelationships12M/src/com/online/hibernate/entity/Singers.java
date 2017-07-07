package com.online.hibernate.entity;

public class Singers {
	int sid;
	String sname;
	String stype;
	String scountry;

	public Singers() {
	}

	public Singers(int sid, String sname, String stype, String scountry) {
		this.sid = sid;
		this.sname = sname;
		this.stype = stype;
		this.scountry = scountry;
	}
	public Singers(String sname, String stype, String scountry) {
		this.sname = sname;
		this.stype = stype;
		this.scountry = scountry;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}

	public String getScountry() {
		return scountry;
	}

	public void setScountry(String scountry) {
		this.scountry = scountry;
	}

}
