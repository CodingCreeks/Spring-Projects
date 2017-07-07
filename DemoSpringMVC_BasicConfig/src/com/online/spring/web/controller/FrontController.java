package com.online.spring.web.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.online.spring.web.dao.EmployeeDAO;
import com.online.spring.web.model.EmployeeAddress;
import com.online.spring.web.model.EmployeeDetails;
import com.online.spring.web.model.EmployeeDetailsAddress;

@Controller
public class FrontController {

	HttpSession session = null;
	EmployeeDAO edao = new EmployeeDAO();
	EmployeeDetails empdetails = new EmployeeDetails();
	EmployeeAddress empaddress = new EmployeeAddress();
	EmployeeDetailsAddress empdetailsaddress = new EmployeeDetailsAddress();

	boolean flag = false;
	int result = 0;
	ResultSet rs = null;

	/* int fkey= edao.checkfkey(); */
	int fkey = (int) (15000 + (Math.random() * (19000 - 15000)));

	@RequestMapping("/createEmployee.asp")
	public String createEmployeeDetails(HttpServletRequest request) {

		empdetailsaddress.setEno(Integer.parseInt(request.getParameter("eno")));
		empdetailsaddress.setEname(request.getParameter("ename"));
		empdetailsaddress.setEdesignation(request.getParameter("edesignation"));
		empdetailsaddress.setEgender(request.getParameter("egender"));
		empdetailsaddress.setEsalary(Double.parseDouble(request.getParameter("esalary")));
		empdetailsaddress.setEusername(request.getParameter("eusername"));
		empdetailsaddress.setEpassword(request.getParameter("epassword"));
		empdetailsaddress.setEaid(fkey);

		empdetailsaddress.setAid(empdetailsaddress.getEaid());
		empdetailsaddress.setStreet(request.getParameter("street"));
		empdetailsaddress.setCity(request.getParameter("city"));
		empdetailsaddress.setState(request.getParameter("state"));
		empdetailsaddress.setPincode(Integer.parseInt(request.getParameter("pincode")));
		empdetailsaddress.setContact(request.getParameter("contact"));
		empdetailsaddress.setEmail(request.getParameter("email"));

		result = edao.insertEmployeeDetailsAddress(empdetailsaddress);

		if (result > 0)
			return "login.jsp";
		else
			System.out.println("Record not Inserted..................");
		return "createEmployee.jsp";
	}

	@RequestMapping("/addEmployeeDetails.asp")
	public String addEmployeeDetails(HttpServletRequest request) {
		empdetailsaddress.setEno(Integer.parseInt(request.getParameter("eno")));
		empdetailsaddress.setEname(request.getParameter("ename"));
		empdetailsaddress.setEdesignation(request.getParameter("edesignation"));
		empdetailsaddress.setEgender(request.getParameter("egender"));
		empdetailsaddress.setEsalary(Double.parseDouble(request.getParameter("esalary")));
		empdetailsaddress.setEusername(request.getParameter("eusername"));
		empdetailsaddress.setEpassword(request.getParameter("epassword"));
		empdetailsaddress.setEaid(fkey);

		empdetailsaddress.setAid(empdetailsaddress.getEaid());
		empdetailsaddress.setStreet(request.getParameter("street"));
		empdetailsaddress.setCity(request.getParameter("city"));
		empdetailsaddress.setState(request.getParameter("state"));
		empdetailsaddress.setPincode(Integer.parseInt(request.getParameter("pincode")));
		empdetailsaddress.setContact(request.getParameter("contact"));
		empdetailsaddress.setEmail(request.getParameter("email"));

		result = edao.insertEmployeeDetailsAddress(empdetailsaddress);

		if (result > 0)
			// return "homePage.jsp";
			return "/getAllEmployees.asp";
		else
			System.out.println("Record not Inserted..................");
		return "addEmployee.jsp";
	}

	@RequestMapping("/checkEmployee.asp")
	public String checkEmployee(HttpServletRequest request, ModelMap map) {
		empdetails.setEusername(request.getParameter("eusername"));
		empdetails.setEpassword(request.getParameter("epassword"));
		flag = edao.checkEmployee(empdetails);
		session = request.getSession();

		if (flag) {
			session.setAttribute("user", request.getParameter("username"));
			map.addAttribute("empdetails", empdetails);
			/*
			 * RequestDispatcher rd =
			 * request.getRequestDispatcher("homePage.jsp"); rd.forward(request,
			 * response);
			 */
			return "homePage.jsp";
		} else
			/*
			 * RequestDispatcher rd = request.getRequestDispatcher(
			 * "login.jsp?message=Invalid+Credentials");
			 * response.sendRedirect("login.jsp?message=Invalid+Credentials");
			 * rd.forward(request, response);
			 */
			return "login.jsp?message=Invalid+Credentials";
		/* return "login.jsp"; */
	}

	@RequestMapping("/getAllEmployees.asp")
	public String readEmployeedetails(HttpServletRequest request,
			/* HttpServletResponse response */ ModelMap map) {
		List<EmployeeDetailsAddress> listOfEmpAndAddress = edao.readEmployeeDetails();

		/*
		 * request.setAttribute("listofempdetailsaddress", listOfEmpAndAddress);
		 * RequestDispatcher rd =
		 * request.getRequestDispatcher("viewEmployees.jsp");
		 * rd.forward(request, response);
		 */
		map.addAttribute("listOfEmpAndAddress", listOfEmpAndAddress);
		return "viewEmployees.jsp";
	}

	@RequestMapping("/getEmployeeDataForEdit.asp")
	public String editEmployeeDetails(HttpServletRequest request,
			/* HttpServletResponse response */ ModelMap map) throws ServletException, IOException {
		empdetailsaddress = new EmployeeDetailsAddress();
		empdetailsaddress.setEno(Integer.parseInt(request.getParameter("eno")));
		empdetailsaddress = edao.getEmployeeDataForEdit(empdetailsaddress);

		/*
		 * * request.setAttribute("empaddress", empdetailsaddress);
		 * RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		 * rd.forward(request, response);
		 */
		map.addAttribute("empdetailsaddress", empdetailsaddress);
		return "edit.jsp";
	}

	@RequestMapping("/updateEmployeeDetails.asp")
	public String updateEmployee(HttpServletRequest request) {
		empdetailsaddress = new EmployeeDetailsAddress();
		empdetailsaddress.setEno(Integer.parseInt(request.getParameter("eno")));
		empdetailsaddress.setEname(request.getParameter("ename"));
		empdetailsaddress.setEdesignation(request.getParameter("edesignation"));
		empdetailsaddress.setEgender(request.getParameter("egender"));
		empdetailsaddress.setEsalary(Double.parseDouble(request.getParameter("esalary")));
		empdetailsaddress.setEusername(request.getParameter("eusername"));
		empdetailsaddress.setEpassword(request.getParameter("epassword"));
		empdetailsaddress.setStreet(request.getParameter("street"));
		empdetailsaddress.setCity(request.getParameter("city"));
		empdetailsaddress.setState(request.getParameter("state"));
		empdetailsaddress.setPincode(Integer.parseInt(request.getParameter("pincode")));
		empdetailsaddress.setContact(request.getParameter("contact"));
		empdetailsaddress.setEmail(request.getParameter("email"));
		result = edao.updateEmployeeDetails(empdetailsaddress);
		if (result > 0)
			return "/getAllEmployees.asp";
		else
			return "edit.jsp";
	}

	@RequestMapping("/removeEmployeedetails.asp")
	public String removeEmployeeDetails(HttpServletRequest request) {

		empdetails.setEno(Integer.parseInt(request.getParameter("eno")));
		result = edao.deleteEmployeeAddressDetails(empdetails);
		if (result > 0)
			result = edao.deleteEmployeeDetails(empdetails);
		if (result > 0) {
			// return "viewEmployees.jsp";
			return "/getAllEmployees.asp";
		} else {
			return "homePage.jsp";
		}
	}

	@RequestMapping("logout.asp")
	public String logout(HttpServletRequest request) {
		session = request.getSession();
		session.invalidate();
		return "login.jsp";
	}

}