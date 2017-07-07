package demoOn19August2016_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpdate {
	
	static Scanner s=null;

	public static void main(String[] args) {
		
		s=new Scanner(System.in);
		System.out.println("Enter the product number to update:");
		
		int ProductNumber=0;
		int ProductPrice=0;
		
		System.out.println("Enter the product price:");	
		ProductPrice=s.nextInt();
		
		System.out.println("Enter the product number:");
		ProductNumber=s.nextInt();
		Connection con=DBConnection.creatconnection();
		try {
			String sql="update products set ProductPrice=? where ProductNumber=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, ProductPrice);
			pst.setInt(2, ProductNumber);
			int result= pst.executeUpdate();
			if(result>0){
				System.out.println("Product"+ProductNumber+" is updated");
			} else{
				System.out.println("Product"+ProductNumber+" is not existing");
			}
			s.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	}


