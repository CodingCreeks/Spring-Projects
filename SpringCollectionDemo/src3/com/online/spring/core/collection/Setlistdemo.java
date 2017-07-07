package com.online.spring.core.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Setlistdemo {
	
	List<String> stringlist;
	Set<Car> carset;
	Map<String, Car> mymap;
	
	
	public void setStringlist(List<String> stringlist) {
		this.stringlist = stringlist;
	}
	public void setCarset(Set<Car> carset) {
		this.carset = carset;
	}
	public void setMymap(Map<String, Car> mymap) {
		this.mymap = mymap;
	}
	public void listPrint(){
		System.out.println(stringlist);
	}
	public void carPrint(){
		System.out.println(carset);
	}
	
	public void mymapprint(){
		System.out.println(mymap);
	}
}
