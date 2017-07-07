package com.codingKnowledge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingKnowledge.dao.UserDao;
import com.codingKnowledge.model.Users;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
	}
	@Autowired
	private UserDao userdao;

	@Override
	public int addUser(Users user) {
		System.out.println("Inside addUserService:" +user.toString());
		return this.userdao.addUser(user);
	}

	@Override
	public void updateUser(Users user) {
		this.userdao.updateUser(user);
	}

	@Override
	public List<Users> listUsers() {
		return this.userdao.listUsers();
	}

	@Override
	public Users getUserById(int id) {
		return this.userdao.getUserById(id);
	}

	@Override
	public void removeUser(int id) {
		this.userdao.removeUser(id);
	}

	@Override
	public boolean userExists(Users user) {
		return this.userdao.userExists(user);
	}

}
