package com.online.web.spring.hibernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.web.spring.hibernate.dao.InventoryDAO;
import com.online.web.spring.hibernate.entity.Users;
import com.online.web.spring.hibernate.util.HibernateUtil;

@Controller
public class Icontroller {
	static SessionFactory factory = HibernateUtil.createConnection();
	static Session session;
	InventoryDAO idao=null;

	@RequestMapping("/showuserlogin.csd")
	public String showlogin(Model model) {
		Users user = new Users();
		model.addAttribute(user);
		return "userloginpage.jsp";
	}

	@RequestMapping("/checkuserlogin")
	public String showlogin(@ModelAttribute("userlogincmd") Users user) {
		idao=new InventoryDAO();
		idao.checkUserCredentials(user);
		return "inventoryhomepage.jsp";
	}

}
