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
import com.online.model.Employee;

@WebServlet("/GetEmployeeRecords")
public class ViewRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDAO eDao = new EmployeeDAO();

		List<Employee> employees = eDao.getAllRecords(); // List of Employees
		
	/*	System.out.println("********************************");	
		for(Employee emp: employees){
			System.out.println(emp.geteNo());
			System.out.println(emp.geteName());
			System.out.println(emp.geteGender());
			System.out.println(emp.geteDesignation());
			System.out.println(emp.geteSalary());			
		}
		
		System.out.println("********************************");*/

	/*	'SendRedirect'- We send only string object along with URL but with 'RequestDispatcher'- we can send any object */
		request.setAttribute("listOfEmployees", employees);		
		RequestDispatcher rd = request.getRequestDispatcher("ViewPage.jsp");
		rd.forward(request, response);
	}

	/*protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}*/
}
