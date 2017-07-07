package com.online.web.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.dao.EmployeeDAO;
import com.online.model.Address;
import com.online.model.Employee;
import com.online.model.EmpAndAddr;

@Controller
public class FController {
	HttpSession session;
	EmployeeDAO eDao = new EmployeeDAO();
	boolean flag = false;
	int result = 0;
	String action = null;
	/*action=request.getServletPath();*/
/*	System.out.println(action);*/
	int fkey = (int) (19000 + Math.random() * (19000 - 15000));

	/* if (action.equals("/check.htm")) */
	@RequestMapping("/check.htm")
		public String checkEmployee(HttpServletRequest request, HttpServletResponse response) {
			
			/*(HttpServletRequest request, HttpServletResponse response)*/
			Employee employee = new Employee();
			employee.setEusername(request.getParameter("username"));
			employee.getEpassword(request.getParameter("password"));
			session = request.getSession(); // 1
			flag = eDao.checkEmployee(employee);
			if (flag) {
				/*session.setAttribute("user", request.getParameter("username")); // 2
				response.sendRedirect("Home.jsp");*/
				return "Home.jsp";
			} else
				/*response.sendRedirect("Login.jsp?message=Invalid+Credentials");*/
				return "Login.jsp";
		}

	/* else if (action.equals("/create.htm")) */
	@RequestMapping("/create.htm")		
			public String insertAddressData(HttpServletRequest request, HttpServletResponse response)	{
			Employee employee = new Employee();
			employee.setEno(Integer.parseInt(request.getParameter("eno")));
			employee.setEname(request.getParameter("ename"));
			employee.setEdesignation(request.getParameter("edesignation"));
			employee.setEgender(request.getParameter("egender"));
			employee.setEsalary(Double.parseDouble(request.getParameter("esal")));
			employee.setEusername(request.getParameter("eusername"));
			employee.setEpassword(request.getParameter("epassword"));
			employee.setEaid(fkey);
			/*try {
				PrintWriter pw = response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

			result = eDao.insertEmployeeData(employee);
			if (result > 0) {

				Address address = new Address();
				address.setAid(employee.getEaid());
				address.setStreet(request.getParameter("street"));
				address.setCity(request.getParameter("city"));
				address.setState(request.getParameter("state"));
				address.setPincode(Integer.parseInt(request.getParameter("pincode")));
				address.setContact(request.getParameter("contact"));
				address.setEmail(request.getParameter("email"));

				result = eDao.insertAddressData(address);

				if (result > 0) {
					/*response.sendRedirect("Login.jsp");*/
					return "Login.jsp";
				} else
					/*pw.println("Record not inserted");*/
					return "CreateEmployee.jsp";
			}
			return action;
		}

	@RequestMapping("/getAll.htm")
			public String getAll(HttpServletRequest request, HttpServletResponse response){
		/*else if (action.equals("/getAll.htm")) {*/

			List<EmpAndAddr> listOfEmployeesAndAddress = eDao.getAllRecords();
			request.setAttribute("listOfRecords", listOfEmployeesAndAddress);
			RequestDispatcher rd = request.getRequestDispatcher("printEmployees.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return action;
		}

	@RequestMapping("/getDataForEdit.htm")
			public void getDataForEdit(HttpServletRequest request, HttpServletRequest response){
		/*else if (action.equals("/getDataForEdit.htm")) {*/

			EmpAndAddr empaddr = new EmpAndAddr();
			empaddr.setEno(Integer.parseInt(request.getParameter("eno")));
			empaddr = eDao.getEditEmployeeRecord(empaddr);
			request.setAttribute("empaddress", empaddr);
			RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
			try {
				rd.forward(request, (ServletResponse) response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	@RequestMapping("/updateEmployee.htm")
			public void updateEmployee(HttpServletRequest request, HttpServletRequest response){

		/*else if (action.equals("/updateEmployee.htm")) {*/
			EmpAndAddr empaddr = new EmpAndAddr();

			empaddr.setEno(Integer.parseInt(request.getParameter("eno")));
			empaddr.setEname(request.getParameter("ename"));
			empaddr.setEdesignation(request.getParameter("edesignation"));
			empaddr.setEgender(request.getParameter("egender"));
			empaddr.setEsalary(Double.parseDouble(request.getParameter("esal")));
			empaddr.setEusername(request.getParameter("eusername"));
			empaddr.setEpassword(request.getParameter("epassword"));

			/*
			 * Employee employee = new Employee();
			 * employee.setEno(empaddr.getEno());
			 * employee.setEname(empaddr.getEname());
			 * employee.setEdesignation(empaddr.getEdesignation());
			 * employee.setEgender(empaddr.getEgender());
			 * employee.setEsalary(empaddr.getEsalary());
			 * employee.setEusername(empaddr.getEusername());
			 * employee.setEpassword(empaddr.getEpassword());
			 * 
			 * result = eDao.updateEmployeeRecord(employee); if (result > 0) {
			 * Address address = new Address();
			 */

			empaddr.setStreet(request.getParameter("street"));
			empaddr.setCity(request.getParameter("city"));
			empaddr.setState(request.getParameter("state"));
			empaddr.setPincode(Integer.parseInt(request.getParameter("pincode")));
			empaddr.setContact(request.getParameter("contact"));
			empaddr.setEmail(request.getParameter("email"));

			/*
			 * empaddr.setStreet(request.getParameter("street"));
			 * empaddr.setCity(request.getParameter("city"));
			 * empaddr.setState(request.getParameter("state"));
			 * empaddr.setPincode(Integer.parseInt(request.getParameter(
			 * "pincode")));
			 * empaddr.setContact(request.getParameter("contact"));
			 * empaddr.setEmail(request.getParameter("email"));
			 */
			result = eDao.updateRecord(empaddr);
			if (result > 0)
				try {
					((HttpServletResponse) response).sendRedirect("getAll.htm");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	@RequestMapping("/remove.htm")
		/*else if (action.equals("/remove.htm")) {*/
		public void remove(HttpServletRequest request, HttpServletRequest response){

			EmpAndAddr empaddress = new EmpAndAddr();
			Employee employee = new Employee();
			empaddress.setEno(Integer.parseInt(request.getParameter("eno")));
			System.out.println("From both" + empaddress.getEno());
			employee.setEno(empaddress.getEno());
			System.out.println("From Employee" + employee.getEno());
			result = eDao.deleteAddressRecord(employee);
			if (result > 0) {

				result = eDao.deleteEmployeeRecord(employee);
				if (result > 0) {
					try {
						((HttpServletResponse) response).sendRedirect("getAll.htm");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

@RequestMapping("/logout.htm")
public void logout(HttpServletRequest request, HttpServletRequest response)
		/*else if (action.equals("/logout.htm"))*/ {
			HttpSession session = request.getSession();
			session.invalidate(); // killing session
			try {
				((HttpServletResponse) response).sendRedirect("Login.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
