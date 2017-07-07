package com.online.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.online.spring.core.Company;
import com.online.spring.core.Employee;

public class App {

	static ApplicationContext context;
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public static void main(String[] args) {
		
		Company cmp=(Company) context.getBean("listofcmp");
		Employee emp = (Employee) context.getBean("setofemp");
		
		System.out.println(".......List of Company.......");
		cmp.printCompanylist();
		
		System.out.println("\n.......Set of Employee's.......");
		emp.printEmployeeset();
		
		System.out.println("\n.......Map of Company and Employee.......");
		cmp.printmap();
	}
	
	
}
