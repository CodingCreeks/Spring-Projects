package com.online.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.dao.EmployeeDAO;
import com.online.employeemodel.Employee;

@WebServlet("/GetEmployeeRecords")
public class GetEmployeeRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDAO eDao = new EmployeeDAO();
		List<Employee> employees = eDao.getAllRecords();
		
		// response.sendRedirect("PrintEmployeeDetails.jsp"); // we send only string object along with URL 
		request.setAttribute("listOfEmployees", employees);
		RequestDispatcher rd = request.getRequestDispatcher("PrintEmployeeDetails.jsp"); // we can send any object
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
