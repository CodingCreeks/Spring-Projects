package com.online.hibernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.online.hibernate.entity.Books;

public class TestHDemoAnnotations {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(new Books("Kuvempu","Mcgrowhill","1965"));
		session.save(new Books("Kuvempu","Mcgrowhill","1966"));
		session.save(new Books("Kuvempu","Mcgrowhill","1967"));
		session.save(new Books("Kuvempu","Mcgrowhill","1968"));
		session.save(new Books("Kuvempu","Mcgrowhill","1969"));
		tr.commit();
		session.close();
		
		session=factory.openSession();
		tr=session.beginTransaction();
		Books b1= session.get(Books.class, 6);
		if(b1!=null)
			System.out.println(b1.getBookId()+"\t"+b1.getAuthor()+"\t"+b1.getPublication()+"\t"+b1.getPublishedYear());
		else
			System.out.println("Record is not existing.....");
		session.close();
	}
}
