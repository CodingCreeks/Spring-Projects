package com.online.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.dao.EmployeeDAO;
import com.online.model.Employee;

@WebServlet("/getDataForEdit")
public class GetDataForEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("eno"));
		
		EmployeeDAO eDao = new EmployeeDAO();
		Employee employee = eDao.getEditRecord(no);
		
		request.setAttribute("employee", employee);
		RequestDispatcher rd = request.getRequestDispatcher("EditPage.jsp");
		rd.forward(request, response);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
	}
	
}
