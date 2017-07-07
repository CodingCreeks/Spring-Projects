package com.online.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.online.factory.DBConnection;
import com.online.model.Employee;


/* 
 * employeedb table details
 * eNo, eName, eDesignation, eGender, eSalary, eUsername, ePassword
 * 
 */
public class EmployeeDAO {
	Connection connection;
	public EmployeeDAO() {
		connection = DBConnection.createConnection();
	}

	public EmployeeDAO(String username, String password) {
		connection = DBConnection.createConnection(username, password);
	}

	public int insertData(Employee employee) {
		int result = 0;
		try {
			String query = "insert into employeedb values(?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, employee.getEno());
			ps.setString(2, employee.getEname());
			ps.setString(3, employee.getEdesignation());
			ps.setString(4, employee.getEgender());
			ps.setDouble(5, employee.getEsal());
			ps.setString(6, employee.getEusername());
			ps.setString(7, employee.getEpassword());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public boolean checkEmployee(Employee employee) {
		boolean flag = false;
		try {
			String query = "select * from employeedb where eUsername=? and ePassword=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, employee.getEusername());
			ps.setString(2, employee.getEpassword());
			ResultSet rs = ps.executeQuery();
			flag = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public List<Employee> getAllRecords() {

		List<Employee> listOfEmployees = new ArrayList<Employee>();

		try {
			String query = "select * from employeedb";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEno(rs.getInt(1));
				employee.setEname(rs.getString(2));
				employee.setEdesignation(rs.getString(3));
				employee.setEgender(rs.getString(4));
				employee.setEsal(rs.getDouble(5));
				employee.setEusername(rs.getString("eUsername"));
				listOfEmployees.add(employee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfEmployees;
	}

	public Employee getEditRecord(int no) {
		Employee employee = null;
		try {
			String query = "select * from employeedb where eNo=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new Employee();
				employee.setEno(rs.getInt(1));
				employee.setEname(rs.getString(2));
				employee.setEdesignation(rs.getString(3));
				employee.setEgender(rs.getString(4));
				employee.setEsal(rs.getDouble(5));
				employee.setEusername(rs.getString("eUsername"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	public int updateEmployeeRecord(Employee employee) {
		int result = 0;
		try {
			String query = "update employeedb set eName=?, eDesignation=?, eGender=?, eSalary=?, eUsername=?, ePassword=? where eNo=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, employee.getEname());
			ps.setString(2, employee.getEdesignation());
			ps.setString(3, employee.getEgender());
			ps.setDouble(4, employee.getEsal());
			ps.setString(5, employee.getEusername());
			ps.setString(6, employee.getEpassword());
			ps.setInt(7, employee.getEno());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteRecord(int no) {
		int result = 0;
		try {
			String query = "delete from employeedb where eNo=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, no);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
