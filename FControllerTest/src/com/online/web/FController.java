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

		if (action.equals("/check.htm")) {
			EmployeeDAO eDao = new EmployeeDAO();
			String uname = request.getParameter("username");
			String pwd = request.getParameter("password");
			Employee employee = new Employee();
			employee.setEusername(uname);
			employee.getEpassword(pwd);
			boolean flag = eDao.checkEmployee(employee);
			HttpSession session = request.getSession(); // 1
			if (flag) {
				session.setAttribute("user", uname); // 2
				response.sendRedirect("Home.jsp");
			} else
				response.sendRedirect("Login.jsp?message=Invalid+Credentials");
		}

		else if (action.equals("/create.htm")) {

			int result;
			EmployeeDAO eDao = new EmployeeDAO();
			Employee employee = new Employee();
			employee.setEno(Integer.parseInt(request.getParameter("eno")));
			employee.setEname(request.getParameter("ename"));
			employee.setEdesignation(request.getParameter("edesignation"));
			employee.setEgender(request.getParameter("egender"));
			employee.setEsal(Double.parseDouble(request.getParameter("esal")));
			employee.setEusername(request.getParameter("eusername"));
			employee.setEpassword(request.getParameter("epassword"));
			PrintWriter pw = response.getWriter();
			String no = null;
			result = eDao.insertData(employee);
			if (result > 0) {
				response.sendRedirect("Login.jsp");
			} else
				pw.println(no + " record is not inserted");
		}

		else if (action.equals("/getAll.htm")) {
			EmployeeDAO eDao = new EmployeeDAO();
			List<Employee> employees = eDao.getAllRecords();
			request.setAttribute("listOfEmployees", employees);
			RequestDispatcher rd = request.getRequestDispatcher("printEmployees.jsp");
			rd.forward(request, response);

		} else if (action.equals("/getDataForEdit.htm")) {
			int no = Integer.parseInt(request.getParameter("eno"));
			EmployeeDAO eDao = new EmployeeDAO();
			Employee employee = eDao.getEditRecord(no);
			request.setAttribute("emp", employee);
			RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
			rd.forward(request, response);

		} else if (action.equals("/updateEmployee.htm")) {
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

			} else if (action.equals("/remove.htm")) {
				int no1 = Integer.parseInt(request.getParameter("eno"));
				EmployeeDAO eDao1 = new EmployeeDAO();
				int result1 = eDao1.deleteRecord(no1);
				if (result1 > 0) {
					response.sendRedirect("getAll.htm");
				}
			}

		} else if (action.equals("/logout.htm")) {
			HttpSession session = request.getSession();
			session.invalidate(); // killing session
			response.sendRedirect("Login.jsp");
		}
	}

	public void destroy() {

	}

}
