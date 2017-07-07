package com.online.web.spring.hibernate.dao;

import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.online.web.spring.hibernate.entity.Users;
import com.online.web.spring.hibernate.util.HibernateUtil;

public class InventoryDAO implements Serializable {
	static final long serialVersionUID=0L;
	
	static SessionFactory factory=null;
	static Session session=null;
	static Transaction tr=null;
	String hql=null;
	boolean flag=false;
	int result=0;

	public boolean checkUserCredentials(Users user) {
		hql="SELECT *FROM users WHERE user=? and password=?";
		factory= HibernateUtil.createConnection();
		session = factory.openSession();
		tr = session.beginTransaction();
		flag=session.createQuery("hql") != null;
		Query q = null;
		q.executeUpdate();
		tr.commit();
		session.close();
		return flag;
	}
		

}
