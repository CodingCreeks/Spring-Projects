package com.online.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.online.factory.DBConnection;
import com.online.model.Address;
import com.online.model.Employee;
import com.online.model.EmpAndAddr;

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
public class EmployeeDAO {

	EmpAndAddr empaddress = new EmpAndAddr();
	Employee employee = new Employee();
	Address address = new Address();

	Connection connection = null;
	PreparedStatement ps = null;
	String query = null;
	ResultSet rs = null;
	int result = 0;
	boolean flag = false;

	public EmployeeDAO() {
		connection = DBConnection.createConnection();
	}

	public EmployeeDAO(String username, String password) {
		connection = DBConnection.createConnection(username, password);
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<EmpAndAddr> getAllRecords() {

		List<EmpAndAddr> listOfEmpAndAddress = new ArrayList<EmpAndAddr>();

		try {

			/* query = "select * from employee, address where eaid=aid"; */
			query = "select *from employee join address on eaid=aid";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				EmpAndAddr empaddress = new EmpAndAddr();
				empaddress.setEno(rs.getInt(1));
				empaddress.setEname(rs.getString(2));
				empaddress.setEdesignation(rs.getString(3));
				empaddress.setEgender(rs.getString(4));
				empaddress.setEsalary(rs.getDouble(5));
				empaddress.setEusername(rs.getString(6));
				empaddress.setEpassword(rs.getString(7));
				empaddress.setEaid(rs.getInt(8));
				empaddress.setAid(rs.getInt(9));
				empaddress.setStreet(rs.getString(10));
				empaddress.setCity(rs.getString(11));
				empaddress.setState(rs.getString(12));
				empaddress.setPincode(rs.getInt(13));
				empaddress.setContact(rs.getString(14));
				empaddress.setEmail(rs.getString(15));
				listOfEmpAndAddress.add(empaddress);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfEmpAndAddress;
	}

	public EmpAndAddr getEditEmployeeRecord(EmpAndAddr empaddr) {
		try {

			/*
			 * query = "select * from employee where eNo?"; query =
			 * "select * from address where (select *from employee where eNo?)";
			 */

			query = "select *from employee join address on eaid=aid where eNo=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, empaddr.getEno());
			rs = ps.executeQuery();
			if (rs.next()) {
				/*empaddr.setEno(rs.getInt("eNo"));*/
				empaddr.setEname(rs.getString("eName"));
				empaddr.setEdesignation(rs.getString("eDesignation"));
				empaddr.setEgender(rs.getString("eGender"));
				empaddr.setEsalary(rs.getDouble("eSalary"));
				empaddr.setEusername(rs.getString("eUsername"));
				empaddr.setEpassword(rs.getString("ePassword"));
				empaddr.setEaid(rs.getInt("eaid"));
				empaddr.setAid(rs.getInt("aid"));
				empaddr.setStreet(rs.getString("street"));
				empaddr.setCity(rs.getString("city"));
				empaddr.setState(rs.getString("state"));
				empaddr.setPincode(rs.getInt("pincode"));
				empaddr.setContact(rs.getString("contact"));
				empaddr.setEmail(rs.getString("email"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empaddr;
	}

	/*
	 * public int updateEmployeeRecord(Employee employee) { try {
	 * 
	 * query =
	 * "update employee set eNo=?, eName=?, eDesignation=?, eGender=?, eSalary=?, eUsername=?, ePassword=?  where eaid=?"
	 * ;
	 * 
	 * ps = connection.prepareStatement(query);
	 * 
	 * ps.setInt(1, employee.getEno()); ps.setString(2, employee.getEname());
	 * ps.setString(3, employee.getEdesignation()); ps.setString(4,
	 * employee.getEgender()); ps.setDouble(5, employee.getEsalary());
	 * ps.setString(6, employee.getEusername()); ps.setString(7,
	 * employee.getEpassword()); ps.setInt(8, employee.getEaid());
	 * 
	 * result = ps.executeUpdate();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return result; }
	 * 
	 * public int updateAddressRecord(Address address) { try {
	 * 
	 * query =
	 * "update employee set eNo=?, eName=?, eDesignation=?, eGender=?, eSalary=?, eUsername=?, ePassword=?  where eaid=?"
	 * ; ps = connection.prepareStatement(query); ps.setString(1,
	 * address.getStreet()); ps.setString(2, address.getCity()); ps.setString(3,
	 * address.getState()); ps.setInt(4, address.getPincode()); ps.setString(5,
	 * address.getContact()); ps.setString(6, address.getEmail()); ps.setInt(7,
	 * address.getAid()); result = ps.executeUpdate();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return result; }
	 */

	public int updateRecord(EmpAndAddr empaddr) {
		try {

			query = "update employee, address set eName=?, eDesignation=?, eGender=?, eSalary=?, eUsername=?, ePassword=?,street=?,city=?,state=?,pincode=?,contact=?,email=? where(eaid=aid && eNo=?)";

			ps = connection.prepareStatement(query);
			ps.setString(1, empaddr.getEname());
			ps.setString(2, empaddr.getEdesignation());
			ps.setString(3, empaddr.getEgender());
			ps.setDouble(4, empaddr.getEsalary());
			ps.setString(5, empaddr.getEusername());
			ps.setString(6, empaddr.getEpassword());
			/*ps.setInt(8, empaddr.getEaid());*/
			ps.setString(7, empaddr.getStreet());
			ps.setString(8, empaddr.getCity());
			ps.setString(9, empaddr.getState());
			ps.setInt(10, empaddr.getPincode());
			ps.setString(11, empaddr.getContact());
			ps.setString(12, empaddr.getEmail());
			ps.setInt(13, empaddr.getEno());
		/*	ps.setInt(7, empaddr.getAid());*/
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteAddressRecord(Employee employee) {

		try {
			query = "delete from address where aid=((select Eaid from employee where eNo=?))";
			ps = connection.prepareStatement(query);
			ps.setInt(1, employee.getEno());

			System.out.println("aid:" + employee.getEno());

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

			System.out.println("aid:" + employee.getEno());

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
