package com.online;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.TestQuery;

public class Test {

	static List<Student> listofstudents = new ArrayList<Student>();
	static Student student = null;
	static int result = 0;

	public static void main(String[] args) {

		TestQuery tq = null;
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		tq = context.getBean("sd", TestQuery.class);

		int count = tq.getNoStudentdentRecords();
		System.out.println("No. of records :" + count);

		String name = tq.getStudentName(105);
		System.out.println("Name of the Student :" + name);

		student = tq.getStudent(104);
		System.out.println(student.getRollno() + "\t" + student.getName() + "\t" + student.getCourse() + "\t"
				+ student.getCollege() + "\t" + student.getUniversity());

		student = new Student(110, "Ramesh", "Electrical Engineering", "Ammanni College of Engineering",
				"Davangere university");
		result = tq.insertStudent(student);
		if (result > 0)
			System.out.println("Record inserted successfully...........");
		else
			System.out.println("Record insersion failed...........");

		listofstudents = tq.getAllStudent();
		for (Student st : listofstudents) {
			System.out.println("+ ------------------------------------------------------------------------ +");
			System.out.println("|"+st.getRollno() +"|"+ "\t" + st.getName()+"|" + "\t" + st.getCourse()+"|" + "\t" + st.getCollege()
			+"|"+ "\t" + st.getUniversity()+"|");
		}

		student = new Student(110, "Siddesh Gowda", "Electronics Engineering", "Appanni College of Engineering",
				"Bengaluru university");
		result = tq.updateStudent(student);
		if (result > 0)
			System.out.println("Update inserted successfully...........");
		else
			System.out.println("Record updation failed...........");

		listofstudents = tq.getAllStudent();
		for (Student st : listofstudents) {
			System.out.println("+ ------------------------------------------------------------------------ +");
			System.out.println("|"+st.getRollno() +"|"+ "\t" + st.getName()+"|" + "\t" + st.getCourse()+"|" + "\t" + st.getCollege()
			+"|"+ "\t" + st.getUniversity()+"|");
		}

		int rollno = 110;
		result = tq.deleteStudent(rollno);
		if (result > 0)
			System.out.println("Deleted successfully...........");
		else
			System.out.println("Record deletion failed...........");

		listofstudents = tq.getAllStudent();
		for (Student st : listofstudents) {
			System.out.println("+ ------------------------------------------------------------------------ +");
			System.out.println("|"+st.getRollno() +"|"+ "\t" + st.getName()+"|" + "\t" + st.getCourse()+"|" + "\t" + st.getCollege()
			+"|"+ "\t" + st.getUniversity()+"|");
			
		}

	}
}
