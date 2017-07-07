package com.online.spring.core.person;

import java.util.List;

public class GroceryList {
	List<String> grocerylist;

	public GroceryList() {
	}

	public void setGrocerylist(List<String> grocerylist) {
		this.grocerylist = grocerylist;
	}

	public void printGroceoryList() {
		System.out.println("Grocerlist :" + grocerylist);
	}
}
