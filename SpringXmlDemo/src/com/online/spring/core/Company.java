package com.online.spring.core;

import com.online.spring.core.regions.Region;

public class Company {
	int cno;
	String cdiv;
	String cdep;
	Region reg;
	
	public Company() {
	}
	
	public void setCno(int cno) {
		this.cno = cno;
	}
	public void setCdiv(String cdiv) {
		this.cdiv = cdiv;
	}
	public void setCdep(String cdep) {
		this.cdep = cdep;
	}
	
	public void setReg(Region reg) {
		this.reg = reg;
	}
/*	public Company(Region reg) {
		this.reg = reg;
	}*/
	
	public Company(int cno, String cdiv, String cdep, Region reg) {
		this.cno = cno;
		this.cdiv = cdiv;
		this.cdep = cdep;
		this.reg = reg;
	}
	public void print(){
		System.out.println(cno+"," +cdiv +","+cdep);
		reg.regionPrint();
	}

}
