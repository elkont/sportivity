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

/**
 * Created by elena on 12/7/2017.
 */
@Controller
public class SearchController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/admin/search", method = RequestMethod.GET)
    public ModelAndView search(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());

        if(user != null) {
            modelAndView.addObject("userMessage", "Hello " + user.getName());
        }
        modelAndView.setViewName("admin/search");
        return modelAndView;
    }
}
