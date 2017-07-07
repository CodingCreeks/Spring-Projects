package com.employee.table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.online.jdbc.DBConnection;
import com.online.model.Employee;

public class EmployeeDAO {
	Connection conn;
	PreparedStatement pst;
	int result=0;

	public EmployeeDAO() {
		conn = DBConnection.createConnection();
	}

	public int insertRecord(Employee employee) {
		
		try {
			
			System.out.println("DB connected succesfully.......");
			String sql = "insert into employee values(?,?,?,?,?,?)";
			pst = conn.prepareStatement(sql);
			System.out.println("SQL executed succesfully.......");
			pst.setInt(1, employee.geteNo());
			pst.setString(2,employee.geteName());
			pst.setString(3, employee.geteGender());
			pst.setDouble(4, employee.geteSalary());
			pst.setString(5, employee.geteDesignation());
			pst.setInt(6, employee.getaId());
			result = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					conn.close();
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return result;
	}
}
