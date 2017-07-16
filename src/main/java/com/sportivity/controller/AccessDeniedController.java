package com.sportivity.controller;

import com.sportivity.model.User;
import com.sportivity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccessDeniedController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/access-denied", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("user", new User());
		if(user != null) {
			modelAndView.addObject("userMessage", "Hello " + user.getName());
		}
		modelAndView.setViewName("access-denied");
		return modelAndView;
	}
}
