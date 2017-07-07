package com.online;

public class Student {
	
	int rollno;
	String name;
	String course;
	String college;
	String university;
	
	public Student() {
	}

	public Student(int rollno, String name, String course, String college, String university) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.college = college;
		this.university = university;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
}
