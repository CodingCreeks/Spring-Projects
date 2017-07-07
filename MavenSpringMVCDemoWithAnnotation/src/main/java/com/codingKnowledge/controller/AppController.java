package com.codingKnowledge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.codingKnowledge.model.AppUser;

@Controller
public class AppController {

	/* We can use the following code to disable the data binding */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "email" });
	}

	@ModelAttribute
	public void index(Model model) {
		System.out.println("Inside Index method.....");
		model.addAttribute("message", "CodingKnowledge Tutorials");
	}

	@RequestMapping("index.sp")
	public ModelAndView indexPage() {
		System.out.println("Inside IndexPage method.....");
		/*
		 * ModelAndView mv = new ModelAndView("index"); return mv;
		 */
		/* Single line of code serve the above purpose */

		return new ModelAndView("index");
	}

	@RequestMapping("applogin.sp")
	public ModelAndView appLogin() {
		System.out.println("Inside applogin method.....");

		/*
		 * AppUser appuser = new AppUser("Manju", "manju@gmail.com");
		 * ModelAndView mv = new ModelAndView(); mv.setViewName("applogin");
		 * mv.addObject("apploginform", appuser); return mv;
		 */

		/* Single line of code serve the above purpose */
		return new ModelAndView("applogin", "apploginform", new AppUser("xyz", 26, "xyz@gmail.com"));
	}

	@RequestMapping("/appUserSearch.sp")
	public ModelAndView appUserSearch(@ModelAttribute("apploginform") AppUser appUser, BindingResult result) {
		System.out.println("Inside appUserSearch method.....");
		if (result.hasErrors()) {
			return new ModelAndView("applogin");
		}

		System.out.println(appUser);
		return new ModelAndView("index");

	}

}
