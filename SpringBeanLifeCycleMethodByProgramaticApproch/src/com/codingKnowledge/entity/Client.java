package com.codingKnowledge.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean {

	private String driver, url, username, password;
	private Connection con;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		/* Resources Initialization */
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Opened....\n");
	}

	public void save(int id, String name, String gender, String address) {
		String sql = "insert into client values(?,?,?,?)";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, gender);
			pst.setString(4, address);
			pst.executeUpdate();
			System.out.println("Inserted Successfully....\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() throws Exception {
		/* Resources Destroy */
		con.close();
		System.out.println("Connection Closed....\n");
	}
}
