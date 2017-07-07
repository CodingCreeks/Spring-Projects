package com.online.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.dao.EmployeeDAO;
import com.online.model.Employee;

@WebServlet("/creatEmployee")
public class CreatEmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		EmployeeDAO eDao = new EmployeeDAO();
		Employee employee = new Employee();
		employee.seteNo(Integer.parseInt(request.getParameter("eNo")));
		employee.seteName(request.getParameter("eName"));
		employee.seteGender(request.getParameter("eGender"));
		employee.seteDesignation(request.getParameter("eDesignation"));
		employee.seteSalary(Double.parseDouble(request.getParameter("eSalary")));
		employee.setePassword(request.getParameter("ePassword"));
		

		int result = eDao.insertRecord(employee);
		System.out.println("Result "+result);
		if (result > 0)
			response.sendRedirect("LoginPage.jsp");
	}
}
