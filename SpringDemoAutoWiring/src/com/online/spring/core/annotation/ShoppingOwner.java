package com.online.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShoppingOwner {
	String ownername;
	GroceryList grocerylist;

	public ShoppingOwner() {
	}

	@Value("CAROWNER")
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	@Autowired
	public void setGrocerylist(GroceryList grocerylist) {
		this.grocerylist = grocerylist;
	}

	public void printShippingOwner() {
		System.out.println("Owner Name :" + ownername);
		grocerylist.printGroceoryList();
	}
}
