package demoOn18August2016;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_tableDisplay {

	public static void main(String[] args) {
		
		String driverName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
		String uName="root";
		String password="root";
		
		
		try {
				Class.forName(driverName);
				Connection con= DriverManager.getConnection(url, uName, password);
				String query="select *from products";
				PreparedStatement pst= con.prepareStatement(query);
				ResultSet rs= pst.executeQuery(query);
				
				//Display table data
				System.out.print("ProductNumber | ProductName | ProductPrice\n");
				System.out.println("------------------------------------------");
				while(rs.next()){				
					System.out.print(rs.getInt("ProductNumber") +"\t      |");
					System.out.print(rs.getString("ProductName")+"\t    |");
					System.out.println(rs.getInt("ProductPrice"));
				}
				rs.close();
				
		} catch (Exception e) {
		e.printStackTrace();
	  }
	}
}
