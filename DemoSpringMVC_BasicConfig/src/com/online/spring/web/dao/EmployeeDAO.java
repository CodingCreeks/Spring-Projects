package com.online.spring.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.online.spring.web.dbconnection.DBConnection;
import com.online.spring.web.model.EmployeeAddress;
import com.online.spring.web.model.EmployeeDetails;
import com.online.spring.web.model.EmployeeDetailsAddress;

public class EmployeeDAO {

	Connection connection = null;
	PreparedStatement pst = null;
	String query = null;
	ResultSet rs = null;
	int result = 0;
	boolean flag = false;

	EmployeeDetails empdetails = new EmployeeDetails();
	EmployeeAddress empaddress = new EmployeeAddress();
	EmployeeDetailsAddress empdetailsaddress = new EmployeeDetailsAddress();

	public EmployeeDAO() {
		connection = DBConnection.createConnection();
	}

	public EmployeeDAO(String eusername, String epassword) {
		connection = DBConnection.createConnection(eusername, epassword);
	}

	public int insertEmployeeDetailsAddress(EmployeeDetailsAddress employeeDetailsAddress) {

		try {
			query = "insert employee values(?,?,?,?,?,?,?,?)";
			pst = connection.prepareStatement(query);
			pst.setInt(1, employeeDetailsAddress.getEno());
			pst.setString(2, employeeDetailsAddress.getEname());
			pst.setString(3, employeeDetailsAddress.getEdesignation());
			pst.setString(4, employeeDetailsAddress.getEgender());
			pst.setDouble(5, employeeDetailsAddress.getEsalary());
			pst.setString(6, employeeDetailsAddress.getEusername());
			pst.setString(7, employeeDetailsAddress.getEpassword());
			pst.setInt(8, employeeDetailsAddress.getEaid());
			result = pst.executeUpdate();
			if (result > 0) {
				query = "insert address values(?,?,?,?,?,?,?)";
				pst = connection.prepareStatement(query);
				pst.setInt(1, employeeDetailsAddress.getAid());
				pst.setString(2, employeeDetailsAddress.getStreet());
				pst.setString(3, employeeDetailsAddress.getCity());
				pst.setString(4, employeeDetailsAddress.getState());
				pst.setInt(5, employeeDetailsAddress.getPincode());
				pst.setString(6, employeeDetailsAddress.getContact());
				pst.setString(7, employeeDetailsAddress.getEmail());
				pst.executeUpdate();
				System.out.println("Successfully inserted all the Employee Details.................");
			} else
				result = 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public boolean checkEmployee(EmployeeDetails empdetails) {

		try {
			query = "select *from employee where eUsername=? and ePassword=?";
			pst = connection.prepareStatement(query);
			pst.setString(1, empdetails.getEusername());
			pst.setString(2, empdetails.getEpassword());
			rs = pst.executeQuery();
			flag = rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public List<EmployeeDetailsAddress> readEmployeeDetails() {

		List<EmployeeDetailsAddress> listofempdetailsaddress = new ArrayList<EmployeeDetailsAddress>();
		query = "select *from employee join address on eaid=aid";
		try {
			pst = connection.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {
				EmployeeDetailsAddress empdetailsaddress = new EmployeeDetailsAddress();
				empdetailsaddress.setEno(rs.getInt(1));
				empdetailsaddress.setEname(rs.getString(2));
				empdetailsaddress.setEdesignation(rs.getString(3));
				empdetailsaddress.setEgender(rs.getString(4));
				empdetailsaddress.setEsalary(rs.getDouble(5));
				empdetailsaddress.setEusername(rs.getString(6));
				empdetailsaddress.setEpassword(rs.getString(7));
				empdetailsaddress.setEaid(rs.getInt(8));

				empdetailsaddress.setAid(rs.getInt(9));
				empdetailsaddress.setStreet(rs.getString(10));
				empdetailsaddress.setState(rs.getString(11));
				empdetailsaddress.setCity(rs.getString(12));
				empdetailsaddress.setPincode(rs.getInt(13));
				empdetailsaddress.setContact(rs.getString(14));
				empdetailsaddress.setEmail(rs.getString(15));

				listofempdetailsaddress.add(empdetailsaddress);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listofempdetailsaddress;
	}

	public EmployeeDetailsAddress getEmployeeDataForEdit(EmployeeDetailsAddress empdetailsaddress) {
		try {
			query = "select *from employee join address on eaid=aid where eNo=?";
			pst = connection.prepareStatement(query);
			pst.setInt(1, empdetailsaddress.getEno());
			rs = pst.executeQuery();
			if (rs.next()) {
				/* empaddr.setEno(rs.getInt("eNo")); */
				empdetailsaddress.setEname(rs.getString("eName"));
				empdetailsaddress.setEdesignation(rs.getString("eDesignation"));
				empdetailsaddress.setEgender(rs.getString("eGender"));
				empdetailsaddress.setEsalary(rs.getDouble("eSalary"));
				empdetailsaddress.setEusername(rs.getString("eUsername"));
				empdetailsaddress.setEpassword(rs.getString("ePassword"));
				empdetailsaddress.setEaid(rs.getInt("eaid"));
				empdetailsaddress.setAid(rs.getInt("aid"));
				empdetailsaddress.setStreet(rs.getString("street"));
				empdetailsaddress.setCity(rs.getString("city"));
				empdetailsaddress.setState(rs.getString("state"));
				empdetailsaddress.setPincode(rs.getInt("pincode"));
				empdetailsaddress.setContact(rs.getString("contact"));
				empdetailsaddress.setEmail(rs.getString("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return empdetailsaddress;

	}

	public int updateEmployeeDetails(EmployeeDetailsAddress empdetailsaddress) {
		try {
			/*
			 * query=
			 * "update employee set(?,?,?,?,?,?,(select eaid from employee where eno=?) where eno=?"
			 * ;
			 */

			query = "update employee, address set eName=?, eDesignation=?, eGender=?, eSalary=?, eUsername=?, ePassword=?,street=?,city=?,state=?,pincode=?,contact=?,email=? where(eaid=aid && eNo=?)";
			pst = connection.prepareStatement(query);
			pst.setString(1, empdetailsaddress.getEname());
			pst.setString(2, empdetailsaddress.getEdesignation());
			pst.setString(3, empdetailsaddress.getEgender());
			pst.setDouble(4, empdetailsaddress.getEsalary());
			pst.setString(5, empdetailsaddress.getEusername());
			pst.setString(6, empdetailsaddress.getEpassword());

			pst.setString(7, empdetailsaddress.getStreet());
			pst.setString(8, empdetailsaddress.getCity());
			pst.setString(9, empdetailsaddress.getState());
			pst.setInt(10, empdetailsaddress.getPincode());
			pst.setString(11, empdetailsaddress.getContact());
			pst.setString(12, empdetailsaddress.getEmail());

			pst.setInt(13, empdetailsaddress.getEno());

			result=pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteEmployeeAddressDetails(EmployeeDetails empdetails) {

		try {
			query = "delete from address where aid=((select eaid from employee where eNo=?))";
			pst = connection.prepareStatement(query);
			pst.setInt(1, empdetails.getEno());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteEmployeeDetails(EmployeeDetails empdetails) {
		try {
			query = "delete from employee where eNo=?";
			pst = connection.prepareStatement(query);
			pst.setInt(1, empdetails.getEno());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/*public int checkfkey() {
		
		int fkey = (int) (15000 + (Math.random() * (19000 - 15000)));
		query = "select *from employee where eaid=?";
		try {
			pst.setInt(1, fkey);
			pst = connection.prepareStatement(query);
			rs = pst.executeQuery();
			flag = rs.next();
			if(!flag){
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fkey;
	}*/
}
