package com.codingKnowledge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.codingKnowledge.model.AppUser;

@Controller
public class AppController {

	@RequestMapping("index.sp")
	public ModelAndView indexPage() {

		System.out.println("Inside IndexPage method.....");
		
		/*String msg = "CodingKnowledge";*/
		ModelAndView mv = new ModelAndView("index");
		
		/*mv.addObject("message", msg);*/
		mv.addObject("message", "CodingKnowledge tutorials");

		return mv;
	}

	@RequestMapping("applogin.sp")
	public ModelAndView appLogin() {

		System.out.println("Inside applogin method.....");

		AppUser appuser = new AppUser();
		appuser.setName("Manju");
		appuser.setEmail("manju@gmail.com");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("applogin");
		mv.addObject("apploginform", appuser);

		/* return new ModelAndView("applogin", "apploginform", appuser); */
		return mv;
	}

	@RequestMapping("/appusersearch.sp")
	public String appUserSearch() {
		System.out.println("Inside appusersearch method.....");

		return "index";

	}

}
