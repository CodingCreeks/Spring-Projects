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
import com.online.factory.DBConnection;
import com.online.model.Address;
import com.online.model.Employee;
import com.online.model.EmpAndAddr;

public class FController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	EmployeeDAO eDao;
	boolean flag = false;
	int result = 0;

	String action = null;

	public void init(ServletConfig config) throws ServletException {
		eDao = new EmployeeDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		action = request.getServletPath();
		System.out.println(action);
		int fkey = (int) (19000 + Math.random() * (19000 - 15000));

		if (action.equals("/check.htm")) {

			Employee employee = new Employee();
			employee.setEusername(request.getParameter("username"));
			employee.getEpassword(request.getParameter("password"));
			session = request.getSession(); // 1
			flag = eDao.checkEmployee(employee);
			if (flag) {
				session.setAttribute("user", request.getParameter("username")); // 2
				response.sendRedirect("Home.jsp");
			} 
			else{
				/*response.sendRedirect("Login.jsp?message=Invalid+Credentials");*/
				request.setAttribute("message","Invalid Cradentials");
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);
			}
		}

		else if (action.equals("/create.htm")) {

			Employee employee = new Employee();
			employee.setEno(Integer.parseInt(request.getParameter("eno")));
			employee.setEname(request.getParameter("ename"));
			employee.setEdesignation(request.getParameter("edesignation"));
			employee.setEgender(request.getParameter("egender"));
			employee.setEsalary(Double.parseDouble(request.getParameter("esal")));
			employee.setEusername(request.getParameter("eusername"));
			employee.setEpassword(request.getParameter("epassword"));
			employee.setEaid(fkey);
			PrintWriter pw = response.getWriter();

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
					response.sendRedirect("Login.jsp");
				} else
					pw.println("Record not inserted");
			}
		}

		else if (action.equals("/getAll.htm")) {

			List<EmpAndAddr> listOfEmployeesAndAddress = eDao.getAllRecords();
			request.setAttribute("listOfRecords", listOfEmployeesAndAddress);
			RequestDispatcher rd = request.getRequestDispatcher("printEmployees.jsp");
			rd.forward(request, response);
		}

		else if (action.equals("/getDataForEdit.htm")) {
			
			EmpAndAddr empaddr = new EmpAndAddr();
			empaddr.setEno(Integer.parseInt(request.getParameter("eno")));
			empaddr = eDao.getEditEmployeeRecord(empaddr);
			request.setAttribute("empaddress", empaddr);
			RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
			rd.forward(request, response);
		}

		else if (action.equals("/updateEmployee.htm")) {
			
			EmpAndAddr empaddr = new EmpAndAddr();
			empaddr.setEno(Integer.parseInt(request.getParameter("eno")));
			empaddr.setEname(request.getParameter("ename"));
			empaddr.setEdesignation(request.getParameter("edesignation"));
			empaddr.setEgender(request.getParameter("egender"));
			empaddr.setEsalary(Double.parseDouble(request.getParameter("esal")));
			empaddr.setEusername(request.getParameter("eusername"));
			empaddr.setEpassword(request.getParameter("epassword"));
			empaddr.setStreet(request.getParameter("street"));
			empaddr.setCity(request.getParameter("city"));
			empaddr.setState(request.getParameter("state"));
			empaddr.setPincode(Integer.parseInt(request.getParameter("pincode")));
			empaddr.setContact(request.getParameter("contact"));
			empaddr.setEmail(request.getParameter("email"));
			result = eDao.updateRecord(empaddr);
			if (result > 0)
				response.sendRedirect("getAll.htm");
		}

		else if (action.equals("/remove.htm")) {

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
					response.sendRedirect("getAll.htm");
				}
			}
		}

		else if (action.equals("/logout.htm")) {
			HttpSession session = request.getSession();
			session.invalidate(); // killing session
			response.sendRedirect("Login.jsp");
		}
	}

	public void destroy() {
		DBConnection.CloseConnection();
	}
}
