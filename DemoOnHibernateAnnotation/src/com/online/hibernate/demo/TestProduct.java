package com.online.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.online.hibernate.entity.Product;

public class TestProduct {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			Product product = new Product("proCode2", "Dove", 500, 85000.00);
			session.beginTransaction();
			session.save(product);
			session.getTransaction().commit();
			System.out.println(product.toString());
		} finally {
			factory.close();
		}
	}
}
