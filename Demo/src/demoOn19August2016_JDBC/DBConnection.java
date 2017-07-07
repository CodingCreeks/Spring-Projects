package demoOn19August2016_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection connection;
		public static Connection creatconnection(){
			
			String DriverName="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
			String userName="root";
			String password="root";
			
			try {
				Class.forName(DriverName);
				connection= DriverManager.getConnection(url, userName, password);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
