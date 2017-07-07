package com.online.spring.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.online.spring.web.factory.DBConnection;
import com.online.spring.web.model.Student;

public class StudentDAO {

	Connection conn=null;
	PreparedStatement pst=null;
	String sql=null;
	ResultSet rs = null;
	int result;
	boolean flag = false;
	List<Student> listofstudents = new ArrayList<Student>();
	Student student = new Student();

	public StudentDAO() {
		conn = DBConnection.creatconnection();
	}

	public StudentDAO(String username, String password) {
		conn = DBConnection.connection(username, password);
	}

	public int insertStudentdata(Student student) {
		sql = "insert into student values(?,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, student.getRollno());
			pst.setString(2, student.getName());
			pst.setString(3, student.getCourse());
			pst.setString(4, student.getCollege());
			pst.setString(5, student.getUniversity());
			result = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean checkStudentdata(Student student) {
		try {
			sql = "select *from student where rollno=? and name=?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, student.getRollno());
			pst.setString(2, student.getName());
			rs = pst.executeQuery();
			flag = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public List<Student> getAllStudents() {
		try {
			sql = "select *from student";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				Student student=new Student();
				student.setRollno(Integer.parseInt(rs.getString(1)));
				student.setName(rs.getString(2));
				student.setCourse(rs.getString(3));
				student.setCollege(rs.getString(4));
				student.setUniversity(rs.getString(5));
				listofstudents.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listofstudents;
	}

	public Student getStudentDataForEdit(Student student) {
		try {
			sql="select *from student where rollno=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, student.getRollno());
			rs=pst.executeQuery();
			while(rs.next()){
				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCourse(rs.getString(3));
				student.setCollege(rs.getString(4));
				student.setUniversity(rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

	public int updateStudent(Student student) {
		try {
			sql="update student set name=?,course=?,college=?,university=? where rollno=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, student.getName());
			pst.setString(2, student.getCourse());
			pst.setString(3,student.getCollege());
			pst.setString(4, student.getUniversity());
			pst.setInt(5, student.getRollno());
			result=pst.executeUpdate();
			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int removeStudent(Student student){
		try {
			sql="delete from student where rollno=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, student.getRollno());
			result=pst.executeUpdate();
			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
