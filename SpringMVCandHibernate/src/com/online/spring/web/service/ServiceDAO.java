package com.online.spring.web.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.online.spring.web.factory.HibUtil;
import com.online.spring.web.model.Customer;

public class ServiceDAO {

	SessionFactory factory = HibUtil.creatSessionFactory();
	int result = 0;

	public ServiceDAO() {
	}

	public int searchCustomer(Customer customer) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Customer cs = new Customer();
		cs = session.get(Customer.class, customer.getCustomerId());
		if (cs != null)
			cs = session.get(Customer.class, customer.getCustomeremail());
		if (cs != null)
			result = 1;
		else
			result = 0;
		tr.commit();
		session.close();
		return result;
	}

	public int insertCustomer(Customer customer) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		result = (int) session.save(customer);
		tr.commit();
		session.close();
		return result;
	}

}
