package com.online.web.spring.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

public class Inventory {
	int id;
	int qty;
	double invcost;
	Set<Invlocation> invlocation=new HashSet<Invlocation>();

	public Inventory() {
	}

	public Inventory(int id, int qty, double invcost, Set<Invlocation> invlocation) {
		this.id = id;
		this.qty = qty;
		this.invcost = invcost;
		this.invlocation = invlocation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getIcost() {
		return invcost;
	}

	public void setIcost(double icost) {
		this.invcost = icost;
	}

	public Set<Invlocation> getInvlocation() {
		return invlocation;
	}

	public void setInvlocation(Set<Invlocation> invlocation) {
		this.invlocation = invlocation;
	}
}
