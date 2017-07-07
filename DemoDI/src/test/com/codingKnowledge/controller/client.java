package com.codingKnowledge.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codingKnowledge.entities.Car;
import com.codingKnowledge.entities.User;
import com.codingKnowledge.entities.UserModel;

public class client {

	public static void main(String[] args) {
		String files[] = { "beans1.xml", "beans2.xml", "beans3.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(files);

		System.out.println("\nDependency Injection by constructor Injection......\n");
		UserModel um1 = (UserModel) context.getBean("user1");
		um1.printUserModel();
		System.out.println("------------------------------------------------------------");
		System.out.println("\nDependency Injection by Setter Injection......\n");
		UserModel um2 = (UserModel) context.getBean("user2");
		um2.printUserModel();

		System.out.println("------------------------------------------------------------");
		System.out.println(
				"\nDependency Injection by constructor Injection problem solved by using properties index......\n");
		UserModel um3 = (UserModel) context.getBean("user3");
		um3.printUserModel();

		System.out.println("------------------------------------------------------------");
		System.out.println("\nDependency Injection by namespaces......\n");
		UserModel um4 = (UserModel) context.getBean("user4");
		um4.printUserModel();
		
		System.out.println("------------------------------------------------------------");
		System.out.println("\nDependency Injection by AutoWire 'byType'......\n");
		User um5 = (User) context.getBean("user5");
		um5.printUserModel();
		
		System.out.println("------------------------------------------------------------");
		System.out.println("\nDependency Injection by AutoWire 'byName'......\n");
		User um6 = (User) context.getBean("user6");
		um6.printUserModel();

		System.out.println();

		Car c1 = (Car) context.getBean("c1");
		c1.print();

	}

}
