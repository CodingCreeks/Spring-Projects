package com.online.spring.web.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}

	public static void main(String[] args) {
		Selectdata sd = (Selectdata) context.getBean("sd");
		Company cmp = new Company("Anju", "1234");
		sd.insertCompanyUser(cmp);
		
		sd.updateCompanyUser(cmp, "manju");

		List<Company> listOfCompanyUSers1 = sd.getAllCompanyUsers();
		System.out.println();
		for (Company company : listOfCompanyUSers1) {
			System.out.println("User: " + company.getUser() + "\t" + "Password: " + company.getPassword());
		}
		
		sd.deleteCompanyUser("Manju");
		List<Company> listOfCompanyUSers2 = sd.getAllCompanyUsers();
		System.out.println();
		for (Company company : listOfCompanyUSers2) {
			System.out.println("User: " + company.getUser() + "\t" + "Password: " + company.getPassword());
		}
	}
}
