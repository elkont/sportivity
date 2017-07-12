package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by elena on 12/7/2017.
 */
@Controller
public class AboutController {
    @RequestMapping(value="/about", method = RequestMethod.GET)
    public ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("about");
        return modelAndView;
    }

}
