package com.online.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.online.dao.EmployeeDAO;
import com.online.model.Employee;

@WebServlet("/*.asp")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);

		if (action.equals("/login.asp")) {
			String eName = request.getParameter("eName");
			String ePassword = request.getParameter("ePassword");
			EmployeeDAO eDao = new EmployeeDAO();
			Employee employee = new Employee();
			employee.seteName(eName);
			employee.setePassword(ePassword);
			boolean flag = eDao.checkEmployee(employee);
			/* 1 httpSeesion variable need to create */
			HttpSession session = request.getSession();
			if (flag) {
				/* 2 need to set the session variable */
				session.setAttribute("user", eName);
				response.sendRedirect("homePage.jsp");
			} else
				response.sendRedirect("loginPage.jsp?message=Invalid%20Credentials");
			/* %20 is for providing the space between the words */
		} else if (action.equals("/creatEmployee.asp")) {
			EmployeeDAO eDao = new EmployeeDAO();
			Employee employee = new Employee();
			employee.seteNo(Integer.parseInt(request.getParameter("eNo")));
			employee.seteName(request.getParameter("eName"));
			employee.seteGender(request.getParameter("eGender"));
			employee.seteDesignation(request.getParameter("eDesignation"));
			employee.seteSalary(Double.parseDouble(request.getParameter("eSalary")));
			employee.setePassword(request.getParameter("ePassword"));
			int result = eDao.insertRecord(employee);
			System.out.println("Result " + result);
			if (result > 0)
				response.sendRedirect("loginPage.jsp");

		} else if (action.equals("/getEmployeeRecords.asp")) {

			EmployeeDAO eDao = new EmployeeDAO();

			List<Employee> employees = eDao.getAllRecords();

			/*
			 * Passing the List of Employees to ViewPage.jsp 'SendRedirect'- We
			 * send only string object along with URL but with
			 * 'RequestDispatcher'- we can send any object
			 * 
			 */
			request.setAttribute("listOfEmployees", employees);
			RequestDispatcher rd = request.getRequestDispatcher("viewPage.jsp");
			rd.forward(request, response);

		} else if (action.equals("/getDataForEdit.asp")) {
			int no = Integer.parseInt(request.getParameter("eno"));

			EmployeeDAO eDao = new EmployeeDAO();
			Employee employee = eDao.getEditRecord(no);

			request.setAttribute("employee", employee);
			RequestDispatcher rd = request.getRequestDispatcher("editPage.jsp");
			rd.forward(request, response);
		} else if (action.equals("/deleteRecord.asp")) {
			int no = Integer.parseInt(request.getParameter("eno"));

			EmployeeDAO eDao = new EmployeeDAO();

			int result = eDao.deleteRecord(no);

			if (result > 0)
				response.sendRedirect("getEmployeeRecords.asp");

		} else if (action.equals("/logout.asp")) {
			HttpSession session = request.getSession();
			session.invalidate(); // killing session
			response.sendRedirect("loginPage.jsp");
		}

		doGet(request, response);
	}

	public void destroy() {

	}

}
