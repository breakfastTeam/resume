package com.smartbean.controller.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by felix on 8/13/17.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = {"/jumpLogin"})
    public String jumpLogin() {
        return "login";
    }

    @RequestMapping(value = {"/jumpRegister"})
    public String jumpRegister() {
        return "register";
    }
}
