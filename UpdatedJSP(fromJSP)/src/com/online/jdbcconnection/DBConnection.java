package com.online.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	static Connection connection;
	static String driverName="com.mysql.jdbc.Driver";
	
	static String url="jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
	static String user="root";
	static String password="root";
	
	public static Connection createConnection(){
		
		try {
			
			Class.forName(driverName);
			connection=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}


