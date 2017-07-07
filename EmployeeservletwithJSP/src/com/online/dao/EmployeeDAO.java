package com.online.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.online.employeemodel.Employee;
import com.online.jdbcconnection.DBConnection;

public class EmployeeDAO {

	Connection conn;
	PreparedStatement pst;
	ResultSet rs=null;
	int result=0;

	public EmployeeDAO() {
		conn = DBConnection.createConnection();
	}

	public boolean checkEmployee(Employee employee) {

		boolean flag=false;
		String sql = "select *from employee where eName=? and ePassword=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, employee.geteName());
			pst.setString(2, employee.getePassword());
			rs = pst.executeQuery();
			flag = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public int insertRecord(Employee employee) {

		String sql = "insert into employee values(?,?,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, employee.geteNo());
			pst.setString(2, employee.geteName());
			pst.setString(3, employee.geteGender());
			pst.setDouble(4, employee.geteSalary());
			pst.setString(5, employee.geteDesignation());
			pst.setString(6, employee.getePassword());
			
			result=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	public List<Employee> getAllRecords() {
		List<Employee> listofEmployees= new ArrayList<Employee>();
		String sql="select *from employee";
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				Employee employee= new Employee();
				employee.seteNo(rs.getInt(1));
				employee.seteName(rs.getString(2));
				employee.seteGender(rs.getString(3));
				employee.seteSalary(rs.getDouble(4));
				employee.seteDesignation(rs.getString(5));
				employee.setePassword(rs.getString(6));
				
				listofEmployees.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listofEmployees;
}

}
