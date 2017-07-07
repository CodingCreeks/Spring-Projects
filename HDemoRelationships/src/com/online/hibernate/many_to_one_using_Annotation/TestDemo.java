package com.online.hibernate.many_to_one_using_Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.online.hibernate.entity.Annotation.Address;
import com.online.hibernate.entity.Annotation.Company;

public class TestDemo {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Company company=new Company();
		company.setCname("Heliossoal Inc");
		Address address=new Address();
		address.setAddress("John Creek, Atlanta");
		address.setPincode("30341");
		company.setAddress(address);
		session.save(company);
		tr.commit();
		session.close();

	}

}
