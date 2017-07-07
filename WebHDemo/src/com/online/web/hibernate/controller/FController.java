package com.online.web.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FController {

	@RequestMapping("/showlogin.mph")
	public String showlogin(Model map){
		return "login.jsp";
	}
}
