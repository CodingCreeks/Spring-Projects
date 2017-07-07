package com.online.hibernate.entity;

import java.util.Set;

public class Passangers {
	int pid;
	String pname;
	Set<Groundtransportation> gts;

	public Passangers() {
	}

	public Passangers(String pname, Set<Groundtransportation> gts) {
		this.pname = pname;
		this.gts = gts;
	}
	public Passangers(String pname) {
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Set<Groundtransportation> getGts() {
		return gts;
	}

	public void setGts(Set<Groundtransportation> gts) {
		this.gts = gts;
	}
}
