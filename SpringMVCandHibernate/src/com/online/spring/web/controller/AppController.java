package com.online.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.spring.web.model.Customer;
import com.online.spring.web.service.ServiceDAO;

@Controller
public class AppController {

	ServiceDAO sdao = new ServiceDAO();
	int result = 0;
	
	@RequestMapping("/showRegCustomer.asp")
	public String showRegCustomer(ModelMap map) {
		Customer customer = new Customer();
		map.addAttribute("regCustomerform", customer);
		return "newCustomer.jsp";
	}

	@RequestMapping("/searchCustomer.asp")
	public String seachCustomer(@ModelAttribute("loginCustomerform") Customer customer) {
		result = sdao.searchCustomer(customer);
		if (result > 0)
			return "homePage.jsp";
		else
			return "index.jsp";
	}

	@RequestMapping("/regCustomer.asp")
	public String regCustomer(@ModelAttribute("regCustomerform") Customer customer) {
		result = sdao.insertCustomer(customer);
		if (result > 0)
			return "index.jsp";
		else
			return "newCustomer.jsp";
	}

}
