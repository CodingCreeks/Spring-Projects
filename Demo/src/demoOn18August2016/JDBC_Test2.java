package demoOn18August2016;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_Test2 {

	public static void main(String[] args) {
		
		String driverName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
		String uName="root";
		String password="root";
		
		Connection con=null;
		
		//String sqlquery = "update products set productName= ? where ProductNumber=?";
		
		String sqlquery= "insert into products values(?,?,?)";
		
		
		try {
				Class.forName(driverName);
				con= DriverManager.getConnection(url, uName, password);
				
				
				PreparedStatement pst= con.prepareStatement(sqlquery);
				
				//pst.setString(1, "abcd");
				//pst.setInt(2, 107);
				
				pst.setInt(1, 101);
				pst.setString(2, "Bicycle");
				pst.setInt(3, 500);
				
				pst.executeUpdate();
				
				//Display table data
				sqlquery= "select *from products";
				ResultSet rs= pst.executeQuery(sqlquery);			
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
