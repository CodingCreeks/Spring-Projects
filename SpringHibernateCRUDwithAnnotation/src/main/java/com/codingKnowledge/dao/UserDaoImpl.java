package com.codingKnowledge.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingKnowledge.model.Users;
import com.codingKnowledge.util.HibernateUtil;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	public UserDaoImpl() {
	}

	@Override
	public int addUser(Users user) {
		System.out.println("Inside UserDaoImpl:" +user.toString());
		return (int) hibernateUtil.create(user);
	}

	@Override
	public void updateUser(Users user) {
		System.out.println("in UserDaoImpl.....");
		Users u = new Users();
		u = getUserById(user.getId());
		u.setName(user.getName());
		u.setEmail(user.getEmail());
		hibernateUtil.update(u);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> listUsers() {
		String hql = "FROM users as u ORDER BY u.id";
		return (List<Users>) hibernateUtil.fetchAll(hql);
	}

	@Override
	public Users getUserById(int id) {
		return hibernateUtil.fetchById(id, Users.class);
	}

	@Override
	public void removeUser(int id) {
		hibernateUtil.delete(getUserById(id));
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public boolean userExists(Users user) {
		String hql = "FROM Users";
		List<Users> userlist = (List<Users>) hibernateUtil.fetchAll(hql);
		return userlist.size() > 0 ? true : false;
	}
}
