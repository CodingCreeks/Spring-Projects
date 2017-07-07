package com.online.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.dao.EmployeeDAO;
import com.online.model.Employee;

@WebServlet("/updateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO eDao= new EmployeeDAO();
		Employee employee= new Employee();
		int result=0;
		employee.seteNo(Integer.parseInt(request.getParameter("eNo")));
		employee.seteName(request.getParameter("eName"));
		employee.seteGender(request.getParameter("eGender"));
		employee.seteDesignation(request.getParameter("eDesignation"));
		employee.seteSalary(Double.parseDouble(request.getParameter("eSalary")));
		employee.setePassword(request.getParameter("ePassword"));
		result=eDao.updateEmployee(employee);
		if(result>0)
		response.sendRedirect("GetEmployeeRecords");
	}

}
