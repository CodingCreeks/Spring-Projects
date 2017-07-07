package com.online;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class TestQuery {
	
	DataSource dataSource;
	JdbcTemplate jdbctemplete;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbctemplete=new JdbcTemplate(dataSource);
	}

	/*public void getAllStudents() {
		try {
			String sql = "select *from student";
			Connection conn=dataSource.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t" + rs.getString(3)+"\t"
						+ rs.getString(4)+"\t" + rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	public int getNoStudentdentRecords(){
		String sql="select count(*) from student";
		int count=jdbctemplete.queryForInt(sql);
		return count;
	}
	
	public String getStudentName(int rollno){
		String sql="select name from student where rollno=?";
		String name=jdbctemplete.queryForObject(sql, new Object[]{rollno}, String.class);
		return name;
	}
	
	public Student getStudent(int rollno){
		String sql="select *from student where rollno=?";
		Student student=jdbctemplete.queryForObject(sql, new Object[]{rollno}, new StudentMapper());
		return student;
	}

	public List<Student> getAllStudent() {
		List<Student>listofstudents= new ArrayList<Student>();
		String sql="select * from student";
		listofstudents=jdbctemplete.query(sql, new StudentMapper());
		return listofstudents;
	}
	public int insertStudent(Student student) {
		String sql="insert into student values(?,?,?,?,?)";
		int result=jdbctemplete.update(sql, new Object[]{student.getRollno(), student.getName(),student.getCourse(),student.getCollege(),student.getUniversity()});
		return result;
	}
	public int updateStudent(Student student) {
		String sql="update student set name=?, course=?, college=?, university=? where rollno=?";
		int result=jdbctemplete.update(sql, new Object[]{student.getName(),student.getCourse(),student.getCollege(),student.getUniversity(), student.getRollno()});
		return result;
	}
	public int deleteStudent(int rollno) {
		String sql="delete from student where rollno=?";
		int result=jdbctemplete.update(sql, new Object[]{rollno});
		return result;
	}
}

class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rownumbers) throws SQLException {
		Student student=new Student();
		student.setRollno(Integer.parseInt(rs.getString(1)));
		student.setName(rs.getString(2));
		student.setCourse(rs.getString(3));
		student.setCollege(rs.getString(4));
		student.setUniversity(rs.getString(5));
		return student;
	}
	
}
