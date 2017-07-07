package com.online.web.spring.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration configuration;
	private static final SessionFactory factory;

	static {
		configuration.configure();
		factory = configuration.buildSessionFactory();
	}

	public static SessionFactory createConnection() {
		return factory;
	}
}
