package demoOn18August2016;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {

	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	   static final String DB_URL = "jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";

	   //  Database credentials
	   static final String USER = "root"; //"username";
	   static final String PASS = "root"; //"password";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql = "DELETE FROM products " +
	                   "WHERE ProductNumber = 105";
	      stmt.executeUpdate(sql);

	      // Now you can extract all the records
	      // to see the remaining records
	      sql = "SELECT ProductNumber, ProductName, ProductPrice FROM products";
	      ResultSet rs = stmt.executeQuery(sql);

	      while(rs.next()){
	         //Retrieve by column name
	         int pNo  = rs.getInt("ProductNumber");
	         String pName = rs.getString("ProductName");
	         double pPrice = rs.getInt("ProductPrice");
	         System.out.println();

	         //Display values
	         System.out.print("ProudctNumber: " + pNo);
	         System.out.print(", ProductName: " + pName);
	         System.out.print(", ProductPrice: " + pPrice);     
	      }
	      rs.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
	}//end JDBCExample

