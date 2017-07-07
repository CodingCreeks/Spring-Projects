package com.codingKnowledge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@ModelAttribute
	public void defaultMessage(Model model){
		model.addAttribute("message", "Coding Knowledge");
	}
	
	@RequestMapping("loginPage.sp")
	public ModelAndView loginPage(){
		
		return  new ModelAndView("login");
	}

}
