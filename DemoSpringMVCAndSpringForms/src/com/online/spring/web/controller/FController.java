package com.online.spring.web.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.online.spring.web.model.Customer;
import com.online.spring.wed.dao.CustomerDAO;

@Controller
public class FController {

	Customer customer = null;
	CustomerDAO cdao = new CustomerDAO();

	boolean flag = false;
	int result = 0;
	ResultSet rs = null;

	@RequestMapping("/showcustomerlogin.asp")
	public String showCutomerLogin(ModelMap map) {
		customer = new Customer();
		map.addAttribute("customerLogin", customer);
		return "customerLoginPage.jsp";
	}

	@RequestMapping("/createCustomer.asp")
	public String createCustomer(ModelMap map) {
		customer = new Customer();
		customer.setCgender("Male");
		map.addAttribute("newCustomer", customer);
		return "createCustomer.jsp";
	}

	@RequestMapping("/createNewCustomer.asp")
	public String createNewCustomer(@ModelAttribute("newCustomer") Customer customer) {

		result = cdao.createNewCustomer(customer);
		if (result > 0)
			return "showcustomerlogin.asp";
		else
			return "createCustomer.asp";
	}

	@RequestMapping("/checkCutomerlogin.asp")
	public String checkCutomerlogin(@ModelAttribute("customerLogin") Customer customer) {
		flag = cdao.checkCustomer(customer);
		if (flag)
			return "customerHomePage.jsp";
		else
			return "showcustomerlogin.asp";
	}

	@RequestMapping("/getAllCustomers.asp")
	public ModelAndView viewAllCustomers() {
		List<Customer> listofcustomer = new ArrayList<Customer>();
		listofcustomer = cdao.viewAllCustomers();
		ModelAndView mv = new ModelAndView();
		mv.addObject("Customerslist", listofcustomer);
		mv.setViewName("view.jsp");

		return mv;
	}

	@RequestMapping("/getCustomerDataForEdit.asp")
	public ModelAndView getCustomerDataForEdit(@ModelAttribute("viewCustomerdetails") Customer cnumber) {
		
		customer=new Customer();
		customer = cdao.getCustomerDetailsForEdit(cnumber);
		System.out.println("Getting customer details....................");
		ModelAndView mv = new ModelAndView();
		mv.addObject("editcustomer", customer);
		mv.setViewName("editCustomerPage.jsp");
		return mv;
		/*map.addAttribute("customer", customer);
		return "editCustomerPage.jsp";*/
	}

	@RequestMapping("/removeCustomerdetails.asp")
	public ModelAndView removeCustomerdetails(@ModelAttribute("viewCustomerdetails") Customer cnumber) {
		result = cdao.removeCustomerDetails(cnumber);
		ModelAndView mv = new ModelAndView();
		if (result > 0)
			mv.setViewName("getAllCustomers.asp");
		return mv;
	}
	
	@RequestMapping("/updateCustomerDetails.asp")
	public ModelAndView updateCustomerDetails(@ModelAttribute("editcustomer") Customer customer){
		result=cdao.updateCustomerDetails(customer);
		ModelAndView mv = new ModelAndView();
		if (result > 0)
			mv.setViewName("getAllCustomers.asp");
		return mv;
	}

	@RequestMapping("logoutStudent.do")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "login.jsp";
	}
}
