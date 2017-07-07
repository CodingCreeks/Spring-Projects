package com.online.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.online.dao.EmployeeDAO;
import com.online.model.Employee;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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
			response.sendRedirect("HomePage.jsp");
		} else
			response.sendRedirect("LoginPage.jsp?message=Invalid%20Credentials");
		/* %20 is for providing the space between the words */
	}
}
