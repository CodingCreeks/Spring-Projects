package com.online.web.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.web.spring.companydao.CompanyDAO;
import com.online.web.spring.model.Company;

@Controller
public class Companycontroller {
	int result = 0;
	boolean flag = false;

	@RequestMapping("/newUser.do")
	public String newUser() {
		System.out.println("newUser....");
		return "newUser.jsp";
	}

	@RequestMapping("/homePage.do")
	public String searchUser(HttpServletRequest request) {
		System.out.println("Searching User.......");
		Company cuser = new Company();
		CompanyDAO cdao = new CompanyDAO();
		cuser.setUser(request.getParameter("user"));
		cuser.setPassword(request.getParameter("password"));
		flag = cdao.searchUSer(cuser);
		if (flag)
			return "homePage.jsp";
		else
			return "index.jsp";
	}

	@RequestMapping("/creatUser.do")
	public String createUser(HttpServletRequest request) {
		System.out.println("CreateUser..........");
		Company cuser = new Company();
		CompanyDAO cdao = new CompanyDAO();
		cuser.setUser(request.getParameter("user"));
		cuser.setPassword(request.getParameter("password"));
		result = cdao.creatUser(cuser);

		if (result > 0) {
			return "index.jsp";
		}
		return "newUser.jsp";
	}

}
