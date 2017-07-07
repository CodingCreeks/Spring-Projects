package com.online.spring.web.core;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Selectdata {

	DataSource dataSource;
	JdbcTemplate jdbcTemplete;
	int result = 0;
	int count = 0;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplete = new JdbcTemplate(dataSource);
	}

	/*
	 * public int getCompanydata() { int result = 0; int count = 0; try {
	 * Connection connection = dataSource.getConnection(); String query =
	 * "select * from company"; PreparedStatement ps =
	 * connection.prepareStatement(query); ResultSet rs = ps.executeQuery();
	 * while (rs.next()) { System.out.println("UserName: " + rs.getString(1) +
	 * "\t\t" + "Password: " + rs.getString(2)); count++; } } catch (Exception
	 * e) { e.printStackTrace(); } System.out.println("\nNumber of users: " +
	 * count); return result;
	 * 
	 * }
	 */

	public List<Company> getAllCompanyUsers() {
		String query = "select *from company";
		List<Company> listOfCompanyUsers = jdbcTemplete.query(query, new companyMapper());
		return listOfCompanyUsers;
	}

	public void insertCompanyUser(Company company) {

		String query = "insert into company values(?,?)";
		result = jdbcTemplete.update(query, new Object[] { company.getUser(), company.getPassword() });
		if (result > 0)
			System.out.println("Record is inserted......");
		else
			System.out.println("Record is not inserted......");
	}

	public void updateCompanyUser(Company company, String user) {

		String query = "update company set user=?, password=? where user=?";
		result = jdbcTemplete.update(query, new Object[] { company.getUser(), company.getPassword(), user });
		if (result > 0)
			System.out.println(user + " Record is Updated to " + company.getUser());
		else
			System.out.println(user + " is not Available......");
	}

	public void deleteCompanyUser(String user) {
		
		String query = "delete from company where user=?";
		result = jdbcTemplete.update(query, new Object[] { user });
		if (result > 0)
			System.out.println(user + " Record is Deleted successfully");
		else
			System.out.println(user + " is not Available......");
	}
}

class companyMapper implements RowMapper<Company> {

	public Company mapRow(ResultSet rs, int rowNumber) throws SQLException {
		Company company = new Company();
		company.setUser(rs.getString(1));
		company.setPassword(rs.getString(2));
		return company;
	}

}
