package com.online.hibernate.dbconnection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {
	public static SessionFactory createsessionFactory(){
		Configuration config=new Configuration();
	/*	config.configure("hibernate.cfg.xml");*/
		config.configure();
		SessionFactory factory= config.buildSessionFactory();
		/*SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		return session;*/
		return factory;
	}
}
