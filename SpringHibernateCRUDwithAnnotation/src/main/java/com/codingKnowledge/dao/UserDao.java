package com.codingKnowledge.dao;

import java.util.List;

import com.codingKnowledge.model.Users;

public interface UserDao {

	int addUser(Users user);

	void updateUser(Users user);

	List<Users> listUsers();

	Users getUserById(int id);

	void removeUser(int id);

	boolean userExists(Users user);

}
