package com.online.spring.web.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
	static SessionFactory factory;
	static {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		factory = configuration.buildSessionFactory();
	}

	public static SessionFactory creatSessionFactory() {
		return factory;
	}

}