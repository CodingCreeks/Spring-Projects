package com.online.hib.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.online.hib.factory.HibUtil;
import com.online.hib.model.Address;
import com.online.hib.model.Employee;

public class TestApp {

	public static void main(String[] args) {

		SessionFactory factory = HibUtil.creatSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Employee emp = new Employee("Manjunatha", "Halappa");
		Address address = new Address("5123 Splading Forest CT", "Atlanta", "30328");
		session.persist(emp);
		session.persist(address);
		tr.commit();
		System.out.println("Data is Stored....");
		session.close();

		session = factory.openSession();
		tr = session.beginTransaction();
		emp = session.get(Employee.class, 1);
		address = session.get(Address.class, 0);
		if (emp != null)
			System.out.println("\nEmployee number:" + emp.getEno() + "\nFirst Name:" + emp.getFname() + "\nLast Name:"
					+ emp.getLname() + "\nStreet:" + address.getStreet() + "\nCity:" + address.getCity() + "\nPincode:"
					+ address.getPincode()+"\n");
		else
			System.out.println("Recored is not existing.....");
		session.close();
	}

}
