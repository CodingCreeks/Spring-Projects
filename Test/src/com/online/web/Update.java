package com.online.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.online.dao.EmployeeDAO;
import com.online.model.Employee;

@WebServlet("/updateEmployee.htm")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int no = Integer.parseInt(request.getParameter("eno"));
		String name = request.getParameter("ename");
		String designation = request.getParameter("edesignation");
		String gender = request.getParameter("egender");
		double sal = Double.parseDouble(request.getParameter("esal"));
		String uname = request.getParameter("eusername");
		String pwd = request.getParameter("epassword");
		Employee employee = new Employee(no, name, designation, gender, sal, uname, pwd);
		EmployeeDAO eDao = new EmployeeDAO();
		int result = eDao.updateEmployeeRecord(employee);
		if (result > 0) {
			response.sendRedirect("getAll.htm");
		}
	}

}
