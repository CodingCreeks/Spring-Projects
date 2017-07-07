package com.codingKnowledge.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingKnowledge.model.Users;
import com.codingKnowledge.service.UserService;

@Controller
public class AppController {

	public AppController() {
	}

	int result = 0;
	boolean flag = false;
	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(AppController.class);

	@ModelAttribute
	public void homeAttributes(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		Users user = new Users();
		model.addAttribute("userform", user);

	}

	@RequestMapping("/")
	public String homePage1() {
		return "home";
	}

	@RequestMapping("/home.sp")
	public String homePage2() {
		return "home";
	}

	@RequestMapping("/createUser.sp")
	public String createUserPage(ModelMap model) {
		Users user = new Users();
		model.addAttribute("createUserform", user);
		logger.info("Adding Users.Data to view" + user);
		return "createUser";
	}

	@RequestMapping("/addUser.sp")
	public String addUser(@ModelAttribute("createUserform") Users user, ModelMap model) {
		logger.info("Adding Users.Data" + user);
		result = userService.addUser(user);
		if (result > 0)
			return "home.sp";

		return "createUser.sp";
	}

	@RequestMapping("/searchUser.sp")
	public String searchUser(@ModelAttribute("userform") Users user) {
		logger.info("Searching Users.Data" + user);
		user.toString();
		flag = userService.userExists(user);

		if (flag) {

			return "userprofile";
		}
		return "home.sp";
	}

	@RequestMapping("/userprofile.sp")
	public String userProfile() {
		return "userprofile";
	}

}
