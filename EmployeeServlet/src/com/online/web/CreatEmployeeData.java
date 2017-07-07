package com.online.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.dao.EmployeeDAO;
import com.online.employeemodel.Employee;

@WebServlet("/CreatEmployeeDataServlet")
public class CreatEmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// PrintWriter pw=response.getWriter();
		// pw.println("Welcome to doPost");
		// response.sendRedirect("creatEmployeeData.html");
		EmployeeDAO eDao = new EmployeeDAO();

		Employee employee = new Employee();
		
		employee.seteNo(Integer.parseInt(request.getParameter("eId")));
		employee.seteName(request.getParameter("eName"));
		employee.seteGender(request.getParameter("eGender"));
		employee.seteSalary(Double.parseDouble(request.getParameter("eSalary")));
		employee.seteDesignation(request.getParameter("eDesignation"));
		employee.setePassword(request.getParameter("ePassword"));
		

		int result = eDao.insertRecord(employee);
		System.out.println("Result "+result);

		PrintWriter pw = response.getWriter();

		if (result > 0) {
			response.sendRedirect("view.html");
			pw.println("Record inserted successfully");
		} else
			//response.sendRedirect("creatEmployeeData.html");
			pw.println("Record not inserted successfully");
	}

	public void destroy() {

	}
}
