package com.realdolmen.controller;

import com.realdolmen.util.LoggerProducer;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @LoggerProducer
    private Logger logger;

    @RequestMapping("/login")
    public String getLoginPage(Model model){
        logger.info("getLoginPage");
        model.addAttribute("isLoggedIn",false);
        return "login";
    }
}
