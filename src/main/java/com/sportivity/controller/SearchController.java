package com.sportivity.controller;

import com.sportivity.model.SearchForm;
import com.sportivity.model.Sport;
import com.sportivity.model.SportCenter;
import com.sportivity.model.User;
import com.sportivity.repository.SportCenterRepository;
import com.sportivity.repository.SportRepository;
import com.sportivity.service.SportService;
import com.sportivity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("sportRepository")
    @Autowired
    private SportRepository sportRepository;

    @Autowired
    private SportService sportService;

    private static final String SEARCH_FORM = "searchForm";
    private static final String SPORTLIST = "sports";


  /*  @RequestMapping(value = "/admin/search", method = RequestMethod.GET)
    public ModelAndView search() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());

        if (user != null) {
            modelAndView.addObject("userMessage", "Hello " + user.getName());
        }
        modelAndView.setViewName("admin/search");
        return modelAndView;
    } */

    @RequestMapping(value = "/admin/search", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute(SEARCH_FORM, new SearchForm());
        return "sport";
    }

    @RequestMapping(value = "/admin/search", method = RequestMethod.POST)
    public String search(@ModelAttribute(SEARCH_FORM) SearchForm searchForm, @RequestParam String title,
                         @RequestParam String location,
                         HttpSession session,
                         RedirectAttributes redirectAttributes, Model model) {

        if (!searchForm.getTitle().isEmpty()) {
            List sportList = sportService.findByTitle(searchForm.getTitle());
            if (!sportList.isEmpty()) {
                redirectAttributes.addFlashAttribute(SPORTLIST, sportList);
            }

           /* List<Sport> results = sportRepository.findByTitle(title);

            model.addAttribute("results", results);*/


        }
        return "redirect:/admin/search";
    }
}
