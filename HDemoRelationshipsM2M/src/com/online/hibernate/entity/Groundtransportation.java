package com.online.hibernate.entity;

import java.util.Set;

public class Groundtransportation {
	int gtid;
	String gtname;
	Set<Passangers> passangers;

	public Groundtransportation() {
	}

	public Groundtransportation(String gtname, Set<Passangers> passangers) {
		this.gtname = gtname;
		this.passangers = passangers;
	}
	
	public Groundtransportation(String gtname) {
		this.gtname = gtname;
	}

	public int getGtid() {
		return gtid;
	}

	public void setGtid(int gtid) {
		this.gtid = gtid;
	}

	public String getGtname() {
		return gtname;
	}

	public void setGtname(String gtname) {
		this.gtname = gtname;
	}

	public Set<Passangers> getPassangers() {
		return passangers;
	}

	public void setPassangers(Set<Passangers> passangers) {
		this.passangers = passangers;
	}
}
