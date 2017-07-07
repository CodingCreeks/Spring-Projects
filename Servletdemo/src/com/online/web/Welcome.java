package com.online.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.table.EmployeeDAO;
import com.online.model.Employee;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init is called");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet is called");
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost is called");
		
		int empId=Integer.parseInt(request.getParameter("eId"));
		String empName = request.getParameter("eName");
		String empGender = request.getParameter("eGender");
		Double empSalary=Double.parseDouble(request.getParameter("eSalary"));
		String empDesignation = request.getParameter("eDesignation");
		int aId = 2005;
		
		
		EmployeeDAO eDAO=new EmployeeDAO();
		Employee employee=new Employee(empId, empName, empGender, empSalary, empDesignation, aId);
		int result=eDAO.insertRecord(employee);
		
		PrintWriter pw=response.getWriter();
		if(result>0)
			pw.println("Record inserted msg in welcome servlet ");
		else
			pw.println("Record not inserted msg in welcome servlet");
			
	}

	@Override
	public void destroy() {
		System.out.println("destroy is called");

	}
}
