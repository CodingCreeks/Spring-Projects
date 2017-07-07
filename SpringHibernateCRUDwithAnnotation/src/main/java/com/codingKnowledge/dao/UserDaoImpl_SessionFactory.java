/*package com.codingKnowledge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.codingKnowledge.model.Users;

@Repository
public class UserDaoImpl_SessionFactory implements UserDao {

	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl_SessionFactory.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(Users user) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(user);
		logger.info("User Saved Successfully, User Details: " + user);

	}

	@Override
	public void updateUser(Users user) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(user);
		logger.info("User Updated Successfully, User Details: " + user);

	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Users> listUsers() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Users> userlist = session.createQuery("from users").list();
		for (Users user : userlist) {
			logger.info("User List :" + user);
		}
		return userlist;

		
		 * Session session = sessionFactory.openSession(); TypedQuery<Users>
		 * query = sessionFactory.createQuery("FROM Admin"); List<Users> result
		 * = query.getResultList(); session.close(); return result;
		 
	}

	@Override
	public Users getUserById(int id) {

		Session session = this.sessionFactory.getCurrentSession();
		Users user = (Users) session.load(Users.class, new Integer(id));
		logger.info("User loaded successfully, User details=" + user);
		return user;
	}

	@Override
	public void removeUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Users user = session.load(Users.class, new Integer(id));
		if (user != null) {
			session.delete(user);
		}
		logger.info("User Removed Successfully, User Details=" + user);

	}

	@Override
	public boolean userExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
*/