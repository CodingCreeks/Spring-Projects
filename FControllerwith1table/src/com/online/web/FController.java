package com.online.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.online.dao.EmployeeDAO;
import com.online.model.Employee;

//@WebServlet("*.htm")
public class FController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	Employee employee = new Employee();
	EmployeeDAO eDao = new EmployeeDAO();
	int result = 0;
	String action = null;

	public void init(ServletConfig config) throws ServletException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/remove.htm")) {
			employee.setEno(Integer.parseInt(request.getParameter("eno")));
			result = eDao.deleteRecord(employee);
			if (result > 0)
				response.sendRedirect("getAll.htm");
		}

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		action = request.getServletPath();
		System.out.println(action);

		if (action.equals("/check.htm")) {
			employee.setEusername(request.getParameter("username"));
			employee.getEpassword(request.getParameter("password"));
			boolean flag = eDao.checkEmployee(employee);
			session = request.getSession(); // 1
			if (flag) {
				session.setAttribute("user", request.getParameter("username")); // 2
				response.sendRedirect("Home.jsp");
			} else
				response.sendRedirect("Login.jsp?message=Invalid+Credentials");
		}

		else if (action.equals("/create.htm")) {
			employee.setEno(Integer.parseInt(request.getParameter("eno")));
			employee.setEname(request.getParameter("ename"));
			employee.setEdesignation(request.getParameter("edesignation"));
			employee.setEgender(request.getParameter("egender"));
			employee.setEsalary(Double.parseDouble(request.getParameter("esal")));
			employee.setEusername(request.getParameter("eusername"));
			employee.setEpassword(request.getParameter("epassword"));
			employee.setStreet(request.getParameter("street"));
			employee.setCity(request.getParameter("city"));
			employee.setState(request.getParameter("state"));
			employee.setPincode(Integer.parseInt(request.getParameter("pincode")));
			employee.setContact(request.getParameter("contact"));
			employee.setEmail(request.getParameter("email"));
			PrintWriter pw = response.getWriter();
			result = eDao.insertData(employee);
			if (result > 0) {
				response.sendRedirect("Login.jsp");
			} else
				pw.println("Duplicate Record is not able to inserted");
		}

		else if (action.equals("/getAll.htm")) {
			List<Employee> employees = eDao.getAllRecords();
			request.setAttribute("listOfEmployees", employees);
			RequestDispatcher rd = request.getRequestDispatcher("printEmployees.jsp");
			rd.forward(request, response);
		}

		else if (action.equals("/getDataForEdit.htm")) {
			employee.setEno(Integer.parseInt(request.getParameter("eno")));
			employee = eDao.getEditRecord(employee);
			request.setAttribute("emp", employee);
			RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
			rd.forward(request, response);
		}

		else if (action.equals("/updateEmployee.htm")) {
			employee.setEno(Integer.parseInt(request.getParameter("eno")));
			employee.setEname(request.getParameter("ename"));
			employee.setEdesignation(request.getParameter("edesignation"));
			employee.setEgender(request.getParameter("egender"));
			employee.setEsalary(Double.parseDouble(request.getParameter("esal")));
			employee.setEusername(request.getParameter("eusername"));
			employee.setEpassword(request.getParameter("epassword"));
			employee.setStreet(request.getParameter("street"));
			employee.setCity(request.getParameter("city"));
			employee.setState(request.getParameter("state"));
			employee.setPincode(Integer.parseInt(request.getParameter("pincode")));
			employee.setContact(request.getParameter("contact"));
			employee.setEmail(request.getParameter("email"));
			int result = eDao.updateEmployeeRecord(employee);
			if (result > 0)
				response.sendRedirect("getAll.htm");
		}

		else if (action.equals("/logout.htm")) {
			HttpSession session = request.getSession();
			session.invalidate(); // killing session
			response.sendRedirect("Login.jsp");
		}
	}

	public void destroy() {

	}
}
