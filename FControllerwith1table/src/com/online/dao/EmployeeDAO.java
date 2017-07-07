package com.online.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.online.factory.DBConnection;
import com.online.model.Employee;


/* 
 * Table Name : employeedbaddress
 * column name's --> eNo, eName, eDesignation, eGender, eSalary, eUsername, ePassword, street, city, state, pincode, contact, email
 * 
 */
public class EmployeeDAO {
	Connection connection;
	int result=0;
	boolean flag = false;
	public EmployeeDAO() {
		connection = DBConnection.createConnection();
	}

	public EmployeeDAO(String username, String password) {
		connection = DBConnection.createConnection(username, password);
	}

	public int insertData(Employee employee) {
		/*int result = 0;*/
		try {
			String query = "insert into employeedbaddress values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, employee.getEno());
			ps.setString(2, employee.getEname());
			ps.setString(3, employee.getEdesignation());
			ps.setString(4, employee.getEgender());
			ps.setDouble(5, employee.getEsalary());
			ps.setString(6, employee.getEusername());
			ps.setString(7, employee.getEpassword());
			ps.setString(8, employee.getStreet());
			ps.setString(9, employee.getCity());
			ps.setString(10, employee.getState());
			ps.setInt(11, employee.getPincode());
			ps.setString(12, employee.getContact());
			ps.setString(13, employee.getEmail());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean checkEmployee(Employee employee) {
		try {
			String query = "select * from employeedbaddress where eUsername=? and ePassword=?";
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
			String query = "select * from employeedbaddress";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEno(rs.getInt(1));
				employee.setEname(rs.getString(2));
				employee.setEdesignation(rs.getString(3));
				employee.setEgender(rs.getString(4));
				employee.setEsalary(rs.getDouble(5));
				employee.setEusername(rs.getString(6));
				employee.setStreet(rs.getString(8));
				employee.setCity(rs.getString(9));
				employee.setState(rs.getString(10));
				employee.setPincode(rs.getInt(11));
				employee.setContact(rs.getString(12));
				employee.setEmail(rs.getString(13));
				listOfEmployees.add(employee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfEmployees;
	}

	public Employee getEditRecord(Employee employee) {
		try {
			String query = "select * from employeedbaddress where eNo=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, employee.getEno());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new Employee();
				employee.setEno(rs.getInt(1));
				employee.setEname(rs.getString(2));
				employee.setEdesignation(rs.getString(3));
				employee.setEgender(rs.getString(4));
				employee.setEsalary(rs.getDouble(5));
				employee.setEusername(rs.getString("eUsername"));
				employee.setStreet(rs.getString(8));
				employee.setCity(rs.getString(9));
				employee.setState(rs.getString(10));
				employee.setPincode(rs.getInt(11));
				employee.setContact(rs.getString(12));
				employee.setEmail(rs.getString(13));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	public int updateEmployeeRecord(Employee employee) {
	/*	int result = 0;*/
		try {
			
			String query = "update employeedbaddress set eName=?, eDesignation=?, eGender=?, eSalary=?, eUsername=?, ePassword=?, street=?, city=?, state=?, pincode=?, contact=?, email=? where eNo=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, employee.getEname());
			ps.setString(2, employee.getEdesignation());
			ps.setString(3, employee.getEgender());
			ps.setDouble(4, employee.getEsalary());
			ps.setString(5, employee.getEusername());
			ps.setString(6, employee.getEpassword());
			ps.setString(7, employee.getStreet());
			ps.setString(8, employee.getCity());
			ps.setString(9, employee.getState());
			ps.setInt(10, employee.getPincode());
			ps.setString(11, employee.getContact());
			ps.setString(12, employee.getEmail());
			ps.setInt(13, employee.getEno());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteRecord(Employee employee) {
		/*int result = 0;*/
		try {
			String query = "delete from employeedbaddress where eNo=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, employee.getEno());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
