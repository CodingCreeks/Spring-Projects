package com.online.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="productID")
	int productID;
	
	@Column(name="productCode")
	String productCode;
	
	@Column(name="name")
	String name;
	
	@Column(name="quantity")
	int quantity;
	@Column(name="price")
	double price;
	
	public Product() {
	}

	public Product(String productCode, String name, int quantity, double price) {
		this.productCode = productCode;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productCode=" + productCode + ", name=" + name + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
}
