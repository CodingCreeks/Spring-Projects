package com.online.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.dao.EmployeeDAO;
import com.online.model.Employee;

@WebServlet("/create.htm")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*int no = Integer.parseInt(request.getParameter("eno"));
		String name = request.getParameter("ename");
		String designation= request.getParameter("edesignation");
		String gender = request.getParameter("egender");
		double sal = Double.parseDouble(request.getParameter("esal"));
		String uname = request.getParameter("eusername");
		String pwd = request.getParameter("epassword");*/
		
		EmployeeDAO eDao = new EmployeeDAO();
		/*Employee employee = new Employee(no, name, designation, gender, sal, uname, pwd);*/
		Employee employee = new Employee();
		employee.setEno(Integer.parseInt(request.getParameter("eno")));
		employee.setEname(request.getParameter("ename"));
		employee.setEdesignation(request.getParameter("edesignation"));
		employee.setEgender(request.getParameter("egender"));
		employee.setEsal(Double.parseDouble(request.getParameter("esal")));
		employee.setEusername(request.getParameter("eusername"));
		employee.setEpassword(request.getParameter("epassword"));
		
		int result = eDao.insertData(employee);
		PrintWriter pw = response.getWriter();
		String no = null;
		if(result > 0){
			//pw.println(no+" record is inserted");
			response.sendRedirect("Login.jsp");
		}
		else
			pw.println(no+" record is not inserted");
	}

}
