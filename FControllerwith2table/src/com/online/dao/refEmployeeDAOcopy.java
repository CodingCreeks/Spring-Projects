package com.online.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.online.factory.DBConnection;
import com.online.model.Address;
import com.online.model.Employee;

/* 
 * First Table Name : employee
 * Second Table Name : address
 *  
 * First table column name's --> eNo, eName, eDesignation, eGender, eSalary, eUsername, ePassword, eaid
 * Second table column name's--> aid, street, city, state, pincode, contact, email
 * 
 */

/*insert into employee values(1002,"Suresh", "Male", "Engineer", 9000, "1234",2000);
 *insert into address values(2000,"Dunwoody","Atlanta","Gerogia", 30328,"+14049106445","suresh@gmail.com");
 *select *from employee, address where eaid=aid;
*/
public class refEmployeeDAOcopy {
	Employee employee = new Employee();
	Address address = new Address();
	
	Connection connection = null;
	PreparedStatement ps = null;
	String query= null;
	ResultSet rs = null;
	int result = 0;
	boolean flag = false;

	public refEmployeeDAOcopy() {
		connection = DBConnection.createConnection();
	}

	public refEmployeeDAOcopy(String username, String password) {
		connection = DBConnection.createConnection(username, password);
	}

	public int insertEmployeeData(Employee employee) {
		try {
			query = "insert into employee values(?,?,?,?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, employee.getEno());
			ps.setString(2, employee.getEname());
			ps.setString(3, employee.getEdesignation());
			ps.setString(4, employee.getEgender());
			ps.setDouble(5, employee.getEsalary());
			ps.setString(6, employee.getEusername());
			ps.setString(7, employee.getEpassword());
			ps.setInt(8, employee.getEaid());
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int insertAddressData(Address address) {
		try {
			
			query = "insert into address values(?,?,?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, address.getAid()); // need to check later
			ps.setString(2, address.getStreet());
			ps.setString(3, address.getCity());
			ps.setString(4, address.getState());
			ps.setInt(5, address.getPincode());
			ps.setString(6, address.getContact());
			ps.setString(7, address.getEmail());
			result = ps.executeUpdate();
					
		}catch(Exception e) {
		e.printStackTrace();
	}
	return result;
	}

	public boolean checkEmployee(Employee employee) {
		try {
			query = "select * from employee, address where eUsername=? and ePassword=? and eaid=aid";
			ps = connection.prepareStatement(query);
			ps.setString(1, employee.getEusername());
			ps.setString(2, employee.getEpassword());
			rs = ps.executeQuery();
			flag = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public List<Employee> getAllEmployeeRecords() {

		List<Employee> listOfEmployees = new ArrayList<Employee>();

		try {
			// query = "select * from employee, address where eaid=aid";
			query = "select * from employee";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				employee.setEno(rs.getInt(1));
				employee.setEname(rs.getString(2));
				employee.setEdesignation(rs.getString(3));
				employee.setEgender(rs.getString(4));
				employee.setEsalary(rs.getDouble(5));
				employee.setEusername(rs.getString(6));
				employee.setEpassword(rs.getString(7));
				employee.setEaid(rs.getInt(8));
				
				listOfEmployees.add(employee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfEmployees;
	}
	
	public List<Address> getAllAddressRecords() {

		List<Address> listOfAddress = new ArrayList<Address>();

		try {
			// query = "select * from employee, address where eaid=aid";
			query = "select * from address";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				address.setAid(rs.getInt(9));
				address.setStreet(rs.getString(10));
				address.setCity(rs.getString(11));
				address.setState(rs.getString(12));
				address.setPincode(rs.getInt(13));
				address.setContact(rs.getString(14));
				address.setEmail(rs.getString(15));
				listOfAddress.add(address);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfAddress;
	}

	public Employee getEditEmployeeRecord(Employee employee) {
		try {
			query = "select * from employee where eNo?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, employee.getEno());
			rs = ps.executeQuery();
			if (rs.next()) {

				employee.setEno(rs.getInt(1));
				employee.setEname(rs.getString(2));
				employee.setEdesignation(rs.getString(3));
				employee.setEgender(rs.getString(4));
				employee.setEsalary(rs.getDouble(5));
				employee.setEusername(rs.getString("eUsername"));

				employee.setEpassword(rs.getString(7));

				employee.setEaid(rs.getInt(8));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	public Address getEditAddressRecord(Address address) {
		try {
			query = "select * from address where (select *from employee where eNo?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, address.getAid());
			rs = ps.executeQuery();
			if (rs.next()) {
				address.setStreet(rs.getString(1));
				address.setCity(rs.getString(2));
				address.setState(rs.getString(3));
				address.setPincode(rs.getInt(4));
				address.setContact(rs.getString(5));
				address.setEmail(rs.getString(6));
				address.setAid(rs.getInt(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return address;
	}

	public int updateEmployeeRecord(Employee employee) {
		try {

			query = "update employee set eNo=?, eName=?, eDesignation=?, eGender=?, eSalary=?, eUsername=?, ePassword=?  where eaid=?";

			ps = connection.prepareStatement(query);

			ps.setInt(1, employee.getEno());
			ps.setString(2, employee.getEname());
			ps.setString(3, employee.getEdesignation());
			ps.setString(4, employee.getEgender());
			ps.setDouble(5, employee.getEsalary());
			ps.setString(6, employee.getEusername());
			ps.setString(7, employee.getEpassword());
			ps.setInt(8, employee.getEaid());

			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int updateAddressRecord(Address address) {
		try {

			query = "update employee set eNo=?, eName=?, eDesignation=?, eGender=?, eSalary=?, eUsername=?, ePassword=?  where eaid=?";
			ps = connection.prepareStatement(query);
				ps.setString(1, address.getStreet());
				ps.setString(2, address.getCity());
				ps.setString(3, address.getState());
				ps.setInt(4, address.getPincode());
				ps.setString(5, address.getContact());
				ps.setString(6, address.getEmail());
				ps.setInt(7, address.getAid());
				result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteAddressRecord(Address address) {

		try {
			query = "delete from address where aid=(select *from employee where?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, address.getAid());
			System.out.println("aid:" + address.getAid());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int deleteEmployeeRecord(Employee employee) {

		try {
				query = "delete from employee where eNo=?";
				ps = connection.prepareStatement(query);
				ps.setInt(1, employee.getEno());
				result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
