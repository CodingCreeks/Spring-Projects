package com.online.spring.web.model;

public class Customer {

	int cnum;
	String ctitle;
	String cfirstname;
	String clastname;
	String cgender;
	String cdob;
	String ccompany;
	String caddress;
	String cwebsite;

	String cusername;
	String cpassword;

	public Customer() {
	}

	public Customer(int cnum, String ctitle, String cfirstname, String clastname, String cgender, String cdob,
			String ccompany, String caddress, String cwebsite, String cusername, String cpassword) {
		this.cnum = cnum;
		this.ctitle = ctitle;
		this.cfirstname = cfirstname;
		this.clastname = clastname;
		this.cgender = cgender;
		this.cdob = cdob;
		this.ccompany = ccompany;
		this.caddress = caddress;
		this.cwebsite = cwebsite;
		this.cusername = cusername;
		this.cpassword = cpassword;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public String getCtitle() {
		return ctitle;
	}

	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}

	public String getCfirstname() {
		return cfirstname;
	}

	public void setCfirstname(String cfirstname) {
		this.cfirstname = cfirstname;
	}

	public String getClastname() {
		return clastname;
	}

	public void setClastname(String clastname) {
		this.clastname = clastname;
	}

	public String getCgender() {
		return cgender;
	}

	public void setCgender(String cgender) {
		this.cgender = cgender;
	}

	public String getCdob() {
		return cdob;
	}

	public void setCdob(String cdob) {
		this.cdob = cdob;
	}

	public String getCcompany() {
		return ccompany;
	}

	public void setCcompany(String ccompany) {
		this.ccompany = ccompany;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCwebsite() {
		return cwebsite;
	}

	public void setCwebsite(String cwebsite) {
		this.cwebsite = cwebsite;
	}

	public String getCusername() {
		return cusername;
	}

	public void setCusername(String cusername) {
		this.cusername = cusername;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
}
