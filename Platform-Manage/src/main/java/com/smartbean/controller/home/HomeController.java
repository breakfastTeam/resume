package com.smartbean.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by felix on 8/13/17.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
