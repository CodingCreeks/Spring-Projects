package com.online.hibernate.testdemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.online.hibernate.entity.Event;
import com.online.hibernate.entity.Singers;

public class TestOne2ManyDemo {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		List<Singers> singerlist=new ArrayList<Singers>();
		Singers s1=new Singers("Gautham","Shastriya Sangeetha","India");
		Singers s2=new Singers("Sunidhi Chavhan","Movie Songs","India");
		singerlist.add(0, s1);
		singerlist.add(1, s2);
		
		Event e=new Event(200,"Summar Song Event","Atlanta", singerlist);
		session.save(e);
		tr.commit();
		session.close();
	}

}
