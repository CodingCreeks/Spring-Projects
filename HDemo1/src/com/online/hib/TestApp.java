package com.online.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestApp {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Employee employee = new Employee();
		
		employee.setFname("Kumar");
		employee.setLname("Vivek");
		
		session.persist(employee);
		
		tr.commit();
		System.out.println("\n------Recoder is inserted----------\n\n");
		session.close();
	}

}
