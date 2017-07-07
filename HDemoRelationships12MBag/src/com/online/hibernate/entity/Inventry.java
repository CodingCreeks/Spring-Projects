package com.online.hibernate.entity;

import java.util.List;

public class Inventry {
	int inId;
	String inlocName;
	List<Products> products;

	public Inventry(int inId, String inlocName, List<Products> products) {
		this.inId = inId;
		this.inlocName = inlocName;
		this.products = products;
	}
	public Inventry(String inlocName, List<Products> products) {
		this.inlocName = inlocName;
		this.products = products;
	}

	public int getInId() {
		return inId;
	}

	public void setInId(int inId) {
		this.inId = inId;
	}

	public String getInlocName() {
		return inlocName;
	}

	public void setInlocName(String inlocName) {
		this.inlocName = inlocName;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
}
