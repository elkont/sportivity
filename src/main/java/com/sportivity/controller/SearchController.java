package com.sportivity.controller;

import com.sportivity.model.SearchForm;
import com.sportivity.model.Sport;
import com.sportivity.model.SportCenter;
import com.sportivity.model.User;
import com.sportivity.repository.SportCenterRepository;
import com.sportivity.repository.SportRepository;
import com.sportivity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by elena on 12/7/2017.
 */
@Controller
public class SearchController {
    @Autowired
    private UserService userService;
    @Autowired
    private SportRepository sportRepository;

    private static final String SEARCH_FORM = "searchForm";



    @RequestMapping(value = "/admin/search", method = RequestMethod.GET)
    public ModelAndView search() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());

        if (user != null) {
            modelAndView.addObject("userMessage", "Hello " + user.getName());
        }
        modelAndView.setViewName("admin/search");
        return modelAndView;
    }
    @RequestMapping(value = "/admin/search", method = RequestMethod.POST)
    public String search(@ModelAttribute(SEARCH_FORM) SearchForm searchForm, @RequestParam String title,
                         @RequestParam String location,
                         HttpSession session,
                         RedirectAttributes redirectAttributes, Model model) {

        List<Sport> results = sportRepository.findByTitle(title);

        model.addAttribute("results", results);

        return "admin/search";
    }

}
