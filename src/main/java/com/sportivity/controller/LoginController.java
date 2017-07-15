package com.sportivity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;

import com.sportivity.model.User;
import com.sportivity.service.UserService;

@Controller
@Scope("session")
public class LoginController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value={"/login"}, method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@RequestMapping(value={"/login"}, method = RequestMethod.POST)
	public ModelAndView loginUser(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("success message", "You are logged in");
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("login");
		return modelAndView;
	}



}
