package com.online.spring.core.person;

public class ShoppingOwner {
	String ownername;
	GroceryList grocerylist;

	public ShoppingOwner() {
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public void setGrocerylist(GroceryList grocerylist) {
		this.grocerylist = grocerylist;
	}

	public void printShippingOwner() {
		System.out.println("Owner Name :" + ownername);
		grocerylist.printGroceoryList();
	}
}
