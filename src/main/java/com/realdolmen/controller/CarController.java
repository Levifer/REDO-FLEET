package com.realdolmen.controller;

import com.realdolmen.util.LoggerProducer;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
@Controller
public class CarController {
    @LoggerProducer
    private Logger logger;

    @RequestMapping("/")
    public String home(Model model, Locale locale) {
        model.addAttribute("isLoggedIn",true);
        logger.info("Locale: " + locale);
        return "redirect:/car";
    }
}
