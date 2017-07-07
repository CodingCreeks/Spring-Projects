package MenuDrivenProgrammingforemployeetable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord {
	static Scanner s;
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	String sql;

	int validate = 0;
	validateRecord obj = new validateRecord();

	public InsertRecord() {

		s = new Scanner(System.in);
		conn = DBConnection.createConnection();
		int result;
		System.out.print("Enter the Employee No :");
		int eNo = s.nextInt();
		
		int k=obj.Recordvalidation(eNo); // Validate the eNo;
		if(k!=1){
			System.out.print("Enter the Employee Name :");
			String eName = s.next();
			;
			System.out.print("Enter the Employee Gender :");
			String eGender = s.next();
			;
			System.out.print("Enter the Employee Salary :");
			Double eSalary = s.nextDouble();
			System.out.print("Enter the Employee Designation :");
			String eDesignation = s.next();
			// String sql1 = "insert into employee
			// values(100,'Johnson','Male',25000,'Engineer')";

			try {

				sql = "insert into employee values(?,?,?,?,?)";
				pst = conn.prepareStatement(sql);
				pst.setInt(1, eNo);
				pst.setString(2, eName);
				pst.setString(3, eGender);
				pst.setDouble(4, eSalary);
				pst.setString(5, eDesignation);
				result = pst.executeUpdate();
				if (result > 0) {
					System.out.println("Record inserted succefully");
				}

		 else {
				System.out.println("Record failed to inserted");
			}
		} catch (SQLException e) {
			// e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}else {
		System.out.println("Duplicate entry");
	}
	}
}
