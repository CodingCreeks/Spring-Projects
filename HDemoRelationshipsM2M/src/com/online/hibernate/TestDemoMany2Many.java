package com.online.hibernate;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.online.hibernate.entity.Groundtransportation;
import com.online.hibernate.entity.Passangers;

public class TestDemoMany2Many {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
	/*	
		Set<Passangers> sp=new HashSet<Passangers>();
		sp.add(new Passangers("Kumar"));
		sp.add(new Passangers("Justifus"));
		
		Groundtransportation gt1=new Groundtransportation("Car",sp);
		Groundtransportation gt2=new Groundtransportation("Plane",sp);
		session.save(gt1);
		session.save(gt2);
		
		Set<Groundtransportation> gt3=new HashSet<Groundtransportation>();
		
		gt3.add(new Groundtransportation("BiCycle"));
		gt3.add(new Groundtransportation("Auto"));
		
		Passangers p1=new Passangers("Priya");
		p1.setGts(gt3);
		session.save(p1);
		
		tr.commit();
		session.close();*/
		
		Set<Groundtransportation> gt=new HashSet<Groundtransportation>();
		
		
		
		gt.add(new Groundtransportation("Auto"));
		gt.add(new Groundtransportation("BiCycle"));
		
		Passangers p1=new Passangers("Priya", gt);
		Passangers p2=new Passangers("Kumar", gt);
		session.save(p1);
		session.save(p2);
		
		Set<Passangers> sp=new HashSet<Passangers>();
		sp.add(new Passangers("Justifus"));
		sp.add(new Passangers("Venkat"));
		
		Groundtransportation obj= new Groundtransportation("Car");
		obj.setPassangers(sp);
		
		session.save(obj);
		tr.commit();
		session.close();

	}

}
