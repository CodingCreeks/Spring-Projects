package com.online.web.spring.companydao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.online.web.spring.factory.DBConnection;
import com.online.web.spring.model.Company;

public class CompanyDAO {
	Connection connection = null;
	PreparedStatement ps = null;
	String query = null;
	int result = 0;
	boolean flag = false;
	ResultSet rs=null;

	public CompanyDAO() {
		connection = DBConnection.creatconnection();
	}

	public CompanyDAO(String username, String password) {
		connection = DBConnection.connection(username, password);
	}

	public int creatUser(Company cuser) {
		try {
			System.out.println("New User Created....");
			query = "insert into company values(?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, cuser.getUser());
			ps.setString(2, cuser.getPassword());
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean searchUSer(Company cuser) {
		System.out.println("Searching User......");
		try {
			query="select *from company where user=? and password=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, cuser.getUser());
			ps.setString(2, cuser.getPassword());
			rs=ps.executeQuery();
			flag=rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
