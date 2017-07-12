package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by elena on 12/7/2017.
 */
@Controller
public class ContactController {
    @RequestMapping(value="/contact", method = RequestMethod.GET)
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contact");
        return modelAndView;
    }
}
