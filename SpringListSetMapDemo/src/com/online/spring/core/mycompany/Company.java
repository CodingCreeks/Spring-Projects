package com.online.spring.core.mycompany;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.online.spring.core.model.Car;

public class Company {
	List<String> listofstring;
	Set<Car> carset;
	Map<String, Car> map;
	Map<Car, Integer> map1;

	public Company() {
	}

	public void setListofstring(List<String> listofstring) {
		this.listofstring = listofstring;
	}

	public void setMap1(Map<Car, Integer> map1) {
		this.map1 = map1;
	}

	public void setCarset(Set<Car> carset) {
		this.carset = carset;
	}

	public void setMap(Map<String, Car> map) {
		this.map = map;
	}

	public void printcompany() {
		System.out.println(listofstring);
		System.out.println(carset);
		System.out.println(map);
		System.out.println(map1);
		
	}

}
