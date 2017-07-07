package com.online.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SuperMarket {
	String walmart;
	String target;
	ShoppingOwner sowner;
	Vehicle vehicle;

	public SuperMarket() {
	}

	@Value("WALMART")
	public void setWalmart(String walmart) {
		this.walmart = walmart;
	}

	@Value("TARGET")
	public void setTarget(String target) {
		this.target = target;
	}
	
	@Autowired
	public void setSowner(ShoppingOwner sowner) {
		this.sowner = sowner;
	}

	@Autowired
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void printSuperMarket(){
		System.out.println("Grocery Shopping Place:"+walmart);
		System.out.println("Grocery Shopping Place:"+target);
		sowner.printShippingOwner();
		vehicle.printVehicle();
	}
}
