package com.online.hibernate;

public class Product {
	int productID;
	String productCode;
	String name;
	int quantity;
	double price;
	
	public Product() {
	}
	public Product(int productID, String productCode, String name, int quantity, Double price) {
		this.productID = productID;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
