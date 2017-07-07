package com.online.hibernate.manytooneusingxml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.online.hibernate.entity.xmlconfig.Address;
import com.online.hibernate.entity.xmlconfig.Student;

public class TestMany2OneXML {

	public static void main(String[] args) {
				Configuration configuration=new Configuration();
				configuration.configure();
				SessionFactory factory=configuration.buildSessionFactory();
				Session session=factory.openSession();
				Transaction tr= session.beginTransaction();
				
				Student s1=new Student();
				Student s2=new Student();
				Student s3=new Student();
				
				Address a1=new Address("John Creek","Atlanta","GA","USA","30341");
				Address a2=new Address("Dunwoody","Atlanta","GA","USA","30332");
				Address a3=new Address("Dunwoody Road","Atlanta","GA","USA","30331");
				
				s1.setSname("Abhisheck");
				s1.setCourse("JAVA");
				s1.setAddress(a1);
				
				s2.setSname("Priya");
				s2.setCourse("Php");
				s2.setAddress(a2);
				
				s3.setSname("Kumar");
				s3.setCourse("C#");
				s3.setAddress(a3);
				
				session.save(s1);
				session.save(s2);
				session.save(s3);
				tr.commit();
				session.close();
	}
}
