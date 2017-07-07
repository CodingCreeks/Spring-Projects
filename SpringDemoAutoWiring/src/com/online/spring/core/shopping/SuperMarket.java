package com.online.spring.core.shopping;

import org.springframework.stereotype.Component;

import com.online.spring.core.person.ShoppingOwner;
import com.online.spring.core.vehicle.Vehicle;

@Component
public class SuperMarket {
	String walmart;
	String target;
	ShoppingOwner sowner;
	Vehicle vehicle;

	public SuperMarket() {
	}

	public void setWalmart(String walmart) {
		this.walmart = walmart;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	
	public void setSowner(ShoppingOwner sowner) {
		this.sowner = sowner;
	}

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
