package com.online.spring.web.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.online.spring.web.dao.StudentDAO;
import com.online.spring.web.model.Student;

@Controller
public class StudentController {

	List<Student> listofstudents = new ArrayList<Student>();
	Student student;
	ModelAndView mv;
	boolean flag = false;
	ResultSet rs = null;
	int result = 0;
	private Student st;

	public static ApplicationContext context;
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	static StudentDAO sdao = context.getBean("data", StudentDAO.class);

	@RequestMapping("showloginStudent.do")
	public String loginstudent(HttpServletRequest request, Model map) {
		HttpSession session = request.getSession();
		session.setAttribute("user", request.getParameter("username"));
		student = new Student();
		map.addAttribute("loginStudentform", student);
		return "login.jsp";
	}

	@RequestMapping("/showregstudent.do")
	public String showregstudent(Model map) {
		student = new Student();
		map.addAttribute("regStudentform", student);
		return "regStudent.jsp";
	}

	@RequestMapping("/showaddStudent.do")
	public String showaddstudent(Model map) {
		student = new Student();
		map.addAttribute("addStudentform", student);
		return "addStudent.jsp";
	}

	@RequestMapping("/regStudent.do")
	public String regstudent(@ModelAttribute("regStudentform") Student student) {
		/*sdao = new StudentDAO();*/
		result = sdao.insertStudentdata(student);
		if (result > 0)
			return "showloginStudent.do";
		return "showregstudent.do";
	}

	@RequestMapping("/addStudent.do")
	public String addstudent(@ModelAttribute("addStudentform") Student student) {
		/*sdao = new StudentDAO();*/
		result = sdao.insertStudentdata(student);
		if (result > 0)
			return "printAllStudent.do";
		return "showaddStudent.do";
	}

	@RequestMapping("checkStudent.do")
	public String checkstudent(@ModelAttribute("loginStudentform") Student student, HttpServletRequest request) {
		if (student.getRollno() != 0 && student.getName() != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", student.getName());
			result = sdao.checkStudentdata(student);
			if (result > 0) {

				return "view.jsp";
			}
		}
		return "showloginStudent.do";
	}

	@RequestMapping("/getStudentDataForEdit.do")
	public ModelAndView getstudentdataforedit(@ModelAttribute("printAllStudentform") Student student) {
	/*	sdao = new StudentDAO();*/
		this.student = new Student();
		this.student = sdao.getStudentDataForEdit(student);
		mv = new ModelAndView();
		mv.addObject("editStudentform", this.student);
		mv.setViewName("editStudent.jsp");
		return mv;
	}

	@RequestMapping("/updateStudent.do")
	public String updatestudent(@ModelAttribute("editStudentform") Student student) {
		/*StudentDAO sdao = new StudentDAO();*/
		st = new Student();
		st.setRollno(student.getRollno());

		result = sdao.updateStudent(student);
		if (result > 0) {
			return "printAllStudent.do";
		}
		return "editStudent.jsp";
	}

	@RequestMapping("/removeStudent.do")
	public String removestudent(@ModelAttribute("printAllStudentform") Student student) {
	/*	sdao = new StudentDAO();*/
		result = sdao.removeStudent(student);
		if (result > 0)
			return "printAllStudent.do";
		return "view.jsp";
	}

	@RequestMapping("/printAllStudent.do")
	public ModelAndView printallstudent() {
		listofstudents = new ArrayList<Student>();
	/*	sdao = new StudentDAO();*/
		listofstudents = sdao.getAllStudents();
		mv = new ModelAndView();
		mv.addObject("studentslist", listofstudents);
		mv.setViewName("printAllStudent.jsp");
		return mv;
	}

	@RequestMapping("/logoutStudent.do")
	public String logoutstudent(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "showloginStudent.do";
	}
}
