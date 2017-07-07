package com.online.web.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.web.springMVC.dao.MOperation;

@Controller
public class CalController {
	
	@RequestMapping("/addservice.do")
	public void addService(@ModelAttribute("mform") MOperation mp) {
		System.out.println("Add Service Called....");
	}

}
