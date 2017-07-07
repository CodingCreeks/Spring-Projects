package com.online.spring.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.online.spring.web.model.Suppliers_Address;

public class SupplierDAO {

	DataSource dataSource;
	JdbcTemplate jdbctemplte;
	List<Suppliers_Address> listofsuppliers = new ArrayList<Suppliers_Address>();
	boolean flag = false;
	String sql = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbctemplte = new JdbcTemplate(dataSource);
	}

	int result = 0;

	public SupplierDAO() {
	}

	public int insertsupplier(Suppliers_Address supaddr) {
		sql = "insert into suppliers values(?,?,?,?,?,?)";
		result = jdbctemplte.update(sql, new Object[] { supaddr.getSupplierID(), supaddr.getCompanyName(),
				supaddr.getContactName(), supaddr.getContactJobTitle(), supaddr.getUsername(), supaddr.getPassword() });

		if (result > 0) {
			result = 0;
			sql = "insert into address values(?,?,?,?,?,?,?,?,?)";
			result = jdbctemplte.update(sql,
					new Object[] { supaddr.getSupplierID(), supaddr.getAddress(), supaddr.getCity(), supaddr.getState(),
							supaddr.getCountry(), supaddr.getPostalcode(), supaddr.getPhoneoffice(), supaddr.getFax(),
							supaddr.getEmail() });
		}
		return result;
	}

	public int checksupplierlogin(Suppliers_Address supaddr) {
		sql = "select count(*) from suppliers where username=? and password=?";
		result = jdbctemplte.queryForInt(sql, new Object[] { supaddr.getUsername(), supaddr.getPassword() });
		return result;
	}

	public List<Suppliers_Address> getallsuppliers() {
		sql = "select *from suppliers join address on suppliersID=addsupplierID";
		listofsuppliers = jdbctemplte.query(sql, new SuppliersAddressRowMapper());
		return listofsuppliers;
	}

	public int updatesupplier(Suppliers_Address supaddr) {
		sql = "update suppliers set companyName=?,contactName=?,contactJobTitle=?,username=?,password=? where suppliersID=?";
		result = jdbctemplte.update(sql, new Object[] { supaddr.getCompanyName(), supaddr.getContactName(),
				supaddr.getContactJobTitle(), supaddr.getUsername(), supaddr.getPassword(), supaddr.getSupplierID() });
		if (result > 0) {
			result = 0;
			sql = "update address set address=?,city=?,state=?, country=?, postalCode=?, phoneOffice=?, fax=?, email=? where addsupplierID=?";
			result = jdbctemplte.update(sql,
					new Object[] { supaddr.getAddress(), supaddr.getCity(), supaddr.getState(), supaddr.getCountry(),
							supaddr.getPostalcode(), supaddr.getPhoneoffice(), supaddr.getFax(), supaddr.getEmail(),
							supaddr.getSupplierID() });
		} else {
			return result = 0;
		}
		return result;
	}

	public Suppliers_Address getsupplierDataForEdit(Suppliers_Address supaddr) {
		sql = "select * from suppliers join address on suppliersID=addsupplierID where suppliersID=?";
		Suppliers_Address supadd = new Suppliers_Address();
		supadd = jdbctemplte.queryForObject(sql, new Object[] { supaddr.getSupplierID() },
				new SuppliersAddressRowMapper());
		return supadd;
	}

	public int removesupplier(Suppliers_Address supaddr) {
		sql="delete from address where addsupplierID=?";
		result=jdbctemplte.update(sql, new Object[]{supaddr.getSupplierID()});
		if(result>0){
			sql="delete from suppliers where suppliersID=?";
			result=jdbctemplte.update(sql, new Object[]{supaddr.getSupplierID()});
		}
		return result;
	}

	public int searchsupplierid(Suppliers_Address supplier) {
		sql="select count(*) from suppliers where suppliersID=?";
		System.out.println("SupplierID in DAO :" + supplier.getSupplierID());
		
		result=jdbctemplte.queryForInt(sql, new Object[]{supplier.getSupplierID()});
		return result;
	}

	public int checkuser(Suppliers_Address supaddr) {
		sql = "select count(*) from suppliers where username=?";
		result = jdbctemplte.queryForInt(sql, new Object[] { supaddr.getUsername()});
		return result;
	}
}

class SuppliersAddressRowMapper implements RowMapper<Suppliers_Address> {

	@Override
	public Suppliers_Address mapRow(ResultSet rs, int rownumbers) throws SQLException {
		Suppliers_Address supaddr = new Suppliers_Address();
		supaddr.setSupplierID(Integer.parseInt(rs.getString(1)));
		supaddr.setCompanyName(rs.getString(2));
		supaddr.setContactName(rs.getString(3));
		supaddr.setContactJobTitle(rs.getString(4));
		supaddr.setUsername(rs.getString(5));
		supaddr.setPassword(rs.getString(6));
		supaddr.setAddsupplierID(Integer.parseInt(rs.getString(7)));
		supaddr.setAddress(rs.getString(8));
		supaddr.setCity(rs.getString(9));
		supaddr.setState(rs.getString(10));
		supaddr.setCountry(rs.getString(11));
		supaddr.setPostalcode(Integer.parseInt(rs.getString(12)));
		supaddr.setPhoneoffice(rs.getString(13));
		supaddr.setFax(rs.getString(14));
		supaddr.setEmail(rs.getString(15));
		return supaddr;
	}
	
}