package com.online.web.spring.hibernate.entity;

import java.util.Set;

/*
 * 		Column Name 			Column Type 									Description
 * 
 *			id 					int 		unsigned not null auto increment 	Unique id for items in this table (primary key)
 *			name				tinytext	Name of the product					hardware name
 *			price				double		product price						price
 *			mfg 				tinytext 	Name of manufacturer who makes this hardware item
 *			model 				tinytext 	Hardware model						model
 *			ymfg				tinytext	year								year of manufacturing
 */

public class Invproduct {
	int id;
	String name;
	Double price;
	String mfg;
	String model;
	String ymfg;
	
	Set<Vendordetails> vendordetails;

	public Invproduct() {
	}

	public Invproduct(int id, String name, Double price, String mfg, String model, String ymfg,
			Set<Vendordetails> vendordetails) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.mfg = mfg;
		this.model = model;
		this.ymfg = ymfg;
		this.vendordetails = vendordetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getMfg() {
		return mfg;
	}

	public void setMfg(String mfg) {
		this.mfg = mfg;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYmfg() {
		return ymfg;
	}

	public void setYmfg(String ymfg) {
		this.ymfg = ymfg;
	}

	public Set<Vendordetails> getVendordetails() {
		return vendordetails;
	}

	public void setVendordetails(Set<Vendordetails> vendordetails) {
		this.vendordetails = vendordetails;
	}
}
