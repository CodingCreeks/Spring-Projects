package com.online.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.online.hibernate.dbconnection.Config;
import com.online.hibernate.entity.Supplier;

public class TestSupplierUsingHibernate {

	public static void main(String[] args) {
		SessionFactory factory = Config.createsessionFactory();
		Session session = factory.openSession();
		Transaction tr=session.beginTransaction();
		Supplier supplier = new Supplier("supplier1", "Subba's Company", "Vijayanagara1, Bengaluru");
		session.save(supplier);
		tr.commit();

		tr = session.beginTransaction();
		Supplier supplier1 = new Supplier("supplier2", "Gubba's Company", "Rajajiayanagara, Bengaluru");
		session.save(supplier1);
		tr.commit();

		tr = session.beginTransaction();
		Supplier supplier2 = new Supplier("supplier3", "Zubba's Company", "Somajinagara, Bengaluru");
		session.save(supplier2);
		tr.commit();

		session.close();
	}
}
