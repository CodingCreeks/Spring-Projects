package com.online.spring.wed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.online.spring.web.JDBCConnection.DBConnection;
import com.online.spring.web.model.Customer;

public class CustomerDAO {

	Connection connection = null;
	PreparedStatement pst = null;

	boolean flag = false;

	String query = null;
	int result = 0;
	ResultSet rs = null;

	Customer customer = new Customer();

	public CustomerDAO() {
		connection = DBConnection.createConnection();
	}

	public int createNewCustomer(Customer customer) {
		query = "insert into customer values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pst = connection.prepareStatement(query);
			pst.setInt(1, customer.getCnum());
			pst.setString(2, customer.getCtitle());
			pst.setString(3, customer.getCfirstname());
			pst.setString(4, customer.getClastname());
			pst.setString(5, customer.getCgender());
			pst.setString(6, customer.getCdob());
			pst.setString(7, customer.getCcompany());
			pst.setString(8, customer.getCaddress());
			pst.setString(9, customer.getCwebsite());
			pst.setString(10, customer.getCusername());
			pst.setString(11, customer.getCpassword());

			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean checkCustomer(Customer customer) {
		try {
			query = "select *from customer where cusername=? and cpassword=?";
			pst = connection.prepareStatement(query);
			pst.setString(1, customer.getCusername());
			pst.setString(2, customer.getCpassword());
			rs = pst.executeQuery();
			flag = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public List<Customer> viewAllCustomers() {
		List<Customer> Listofcustomers = new ArrayList<Customer>();
		try {
			query = "select *from customer";
			pst = connection.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {
				customer = new Customer();
				customer.setCnum(rs.getInt(1));
				customer.setCtitle(rs.getString(2));
				customer.setCfirstname(rs.getString(3));
				customer.setClastname(rs.getString(4));
				customer.setCgender(rs.getString(5));
				customer.setCdob(rs.getString(6));
				customer.setCcompany(rs.getString(7));
				customer.setCaddress(rs.getString(8));
				customer.setCwebsite(rs.getString(9));
				customer.setCusername(rs.getString(10));
				customer.setCpassword(rs.getString(11));
				Listofcustomers.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Listofcustomers;
	}

	public Customer getCustomerDetailsForEdit(Customer cnumber) {
		try {
			query = "select * from customer where cnum=?";
			pst=connection.prepareStatement(query);
			pst.setInt(1, cnumber.getCnum());
			rs=pst.executeQuery();
			if(rs.next()){
				customer.setCnum(rs.getInt(1));
				customer.setCtitle(rs.getString(2));
				customer.setCfirstname(rs.getString(3));
				customer.setClastname(rs.getString(4));
				customer.setCgender(rs.getString(5));
				customer.setCdob(rs.getString(6));
				customer.setCcompany(rs.getString(7));
				customer.setCaddress(rs.getString(8));
				customer.setCwebsite(rs.getString(9));
				customer.setCusername(rs.getString(10));
				customer.setCpassword(rs.getString(11));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return customer;
	}
	
	public int updateCustomerDetails(Customer customer){
		try {
			query="update customer set ctitle=?,cfirstname=?,clastname=?,cgender=?,cdob=?,ccompany=?,caddress=?,cwebsite=?,cusername=?,cpassword=? where cnum=?";
			pst=connection.prepareStatement(query);
			pst.setString(1, customer.getCtitle());
			pst.setString(2, customer.getCfirstname());
			pst.setString(3, customer.getClastname());
			pst.setString(4, customer.getCgender());
			pst.setString(5, customer.getCdob());
			pst.setString(6, customer.getCcompany());
			pst.setString(7, customer.getCaddress());
			pst.setString(8, customer.getCwebsite());
			pst.setString(9, customer.getCusername());
			pst.setString(10, customer.getCpassword());
			pst.setInt(11, customer.getCnum());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

	public int removeCustomerDetails(Customer cnumber) {
		try {
			query="delete from customer where cnum=?";
			pst=connection.prepareStatement(query);
			pst.setInt(1, cnumber.getCnum());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
