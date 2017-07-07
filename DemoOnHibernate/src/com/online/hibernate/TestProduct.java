package com.online.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestProduct {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		/*Session session = factory.getCurrentSession();*/
		Session session = factory.openSession();
		Transaction tr= session.beginTransaction();
		
		Product product=new Product();
		
		product.setProductCode("proCode1");
		product.setName("Palmolive.......");
		product.setQuantity(200);
		product.setPrice(45000.00);
		
		session.persist(product);
		tr.commit();
		session.close();
	}

}
