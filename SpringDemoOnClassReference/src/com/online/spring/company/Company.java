package com.online.spring.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.spring.employee.Employee;

public class Company {

	public static void main(String[] args) {
		Employee employee;
		ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");

		/* employee=(Employee) context.getBean("employee1"); */

		employee = context.getBean("emp1", Employee.class);
		employee.print();
		System.out.println("\n**************************************************************************");
		employee = context.getBean("emp2", Employee.class);
		employee.print();
	}

}
