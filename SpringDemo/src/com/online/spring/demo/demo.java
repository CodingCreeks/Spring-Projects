package com.online.spring.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.demo.DAO;

public class demo {
	
	static ApplicationContext context;
	static  {
	context=new ClassPathXmlApplicationContext("beans.xml");
}
	
	public static void main(String[] args) {
		DAO dao=(DAO) context.getBean("dao1");
		dao.printDAO();
	}
}
