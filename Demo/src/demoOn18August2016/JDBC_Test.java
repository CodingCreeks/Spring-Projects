package demoOn18August2016;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.jdbc.Connection;

public class JDBC_Test {

	public static void main(String[] args) {
		
		String driverName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
		String uName="root";
		String password="root";
		
		Connection con=null;
		Statement st=null;
		
		try {
				Class.forName(driverName);
				con= (Connection) DriverManager.getConnection(url, uName, password);
				st = con.createStatement();
				String sqlquery="insert into products values(107,'Ship', 2350000) ";
				st.executeUpdate(sqlquery);
				
				//Display table data
				sqlquery= "select *from products";
				ResultSet rs= st.executeQuery(sqlquery);			
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
