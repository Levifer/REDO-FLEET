package com.realdolmen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
@Controller
public class CarController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
