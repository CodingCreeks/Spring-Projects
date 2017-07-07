package com.online.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.online.hibernate.entity.Inventry;
import com.online.hibernate.entity.Products;

public class TestDemoOne2ManyBag {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session= factory.openSession();
		Transaction tr= session.beginTransaction();
		
		List<Products> productslist =new ArrayList<Products>();
		
		Products p1=new Products("Aircraft Wings", "GE", "2016");
		Products p2=new Products("Aircraft Engine", "GE", "2016");
		
		productslist.add(p1);
		productslist.add(p2);
	/*	Inventry i1=new Inventry(1001, "RackSpace-1", productslist);*/
		Inventry i1=new Inventry("RackSpace-1", productslist);
		
		session.save(i1);
		tr.commit();
		session.close();

	}

}
