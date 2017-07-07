package com.online.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.online.dao.EmployeeDAO;
import com.online.model.Employee;

@WebServlet("*.htm")
public class FController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();	
		System.out.println(action);
		
		if(action.equals("/check.htm")){
			EmployeeDAO eDao = new EmployeeDAO();
			
			String uname = request.getParameter("username");
			String pwd = request.getParameter("password");
			
			Employee employee = new Employee();
			employee.setEusername(uname);
			employee.getEpassword(pwd);
			
			boolean flag = eDao.checkEmployee(employee);
			
			HttpSession session = request.getSession();		// 1
			if(flag){
				session.setAttribute("user", uname);		//2
				response.sendRedirect("Home.jsp");
			}
			else
				response.sendRedirect("Login.jsp?message=Invalid+Credentials");
		}
		
		else if(action.equals("/create.htm")){
			
		}
		
		else if(action.equals("/getAll.htm")){
			
		}
		else if(action.equals("/getDataForEdit.htm")){
			
		}
		else if(action.equals("/updateEmployee.htm")){
			
		}
		else if(action.equals("/remove.htm")){
			
		}
		else if(action.equals("/logout.htm")){
			
		}
	}

	public void destroy() {

	}

}

	
	
