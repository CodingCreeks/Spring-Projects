/*package com.online.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/hibernatedb?useSSL=false&amp;useLegacyDatetimecode=false";
		String user="root";
		String password="rootjt";
		System.out.println("Creating JDBC Connection....");
		try {
			Connection conn=DriverManager.getConnection(url, user, password);
			System.out.println("Connected sucessfull......");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
*/