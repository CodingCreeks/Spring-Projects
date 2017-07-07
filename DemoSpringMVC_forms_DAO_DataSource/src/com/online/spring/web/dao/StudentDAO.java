package com.online.spring.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.online.spring.web.model.Student;

public class StudentDAO {

	DataSource dataSource;
	JdbcTemplate jdbctemplte;

	List<Student> listofstudents = new ArrayList<Student>();
	Student student = new Student();
	String sql=null;
	boolean flag=false;
	int result=0;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbctemplte = new JdbcTemplate(dataSource);
	}

	public StudentDAO() {
	}

	public int checkStudentdata(Student student) {
		sql = "select count(*) from student where rollno=? and name=?";
		result =jdbctemplte.queryForInt(sql, new Object[]{student.getRollno(), student.getName()});
		System.out.println(result);
		
		return result;
	}

	public List<Student> getAllStudents() {
		sql = "select *from student";
		listofstudents = jdbctemplte.query(sql, new StudentRowMapper());
		return listofstudents;
	}

	public Student getStudentDataForEdit(Student student) {
		sql = "select *from student where rollno=?";
		student = jdbctemplte.queryForObject(sql, new Object[] { student.getRollno() }, new StudentRowMapper());
		return student;
	}

	public int insertStudentdata(Student student) {
		sql = "insert into student values(?,?,?,?,?)";
		result = jdbctemplte.update(sql, new Object[] { student.getRollno(), student.getName(), student.getCourse(),
				student.getCollege(), student.getUniversity() });
		return result;
	}

	public int updateStudent(Student student) {
		sql = "update student set name=?,course=?,college=?,university=? where rollno=?";
		result = jdbctemplte.update(sql, new Object[] { student.getName(), student.getCourse(), student.getCollege(),
				student.getUniversity(), student.getRollno() });
		return result;
	}

	public int removeStudent(Student student) {
		sql = "delete from student where rollno=?";
		result = jdbctemplte.update(sql, new Object[] { student.getRollno() });
		return result;
	}
}

class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rownumbers) throws SQLException {
		Student student = new Student();
		student.setRollno(Integer.parseInt(rs.getString(1)));
		student.setName(rs.getString(2));
		student.setCourse(rs.getString(3));
		student.setCollege(rs.getString(4));
		student.setUniversity(rs.getString(5));
		return student;
	}
}