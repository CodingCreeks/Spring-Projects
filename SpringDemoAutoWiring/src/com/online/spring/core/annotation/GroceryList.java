package com.online.spring.core.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class GroceryList {
	List<String> grocerylist;

	public GroceryList() {
	}

	@Value("Fruits, Snacks, Granices")
	public void setGrocerylist(List<String> grocerylist) {
		this.grocerylist = grocerylist;
	}

	public void printGroceoryList() {
		System.out.println("Grocerlist :" + grocerylist);
	}
}
