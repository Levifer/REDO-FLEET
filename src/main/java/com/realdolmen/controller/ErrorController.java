package com.realdolmen.controller;

import com.realdolmen.util.LoggerProducer;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorController {
    @LoggerProducer
    private Logger logger;

    @RequestMapping(value="/error")
    public String handle(HttpServletRequest request, Model model) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        logger.info("Error code: " + statusCode);
        model.addAttribute("errorCode",statusCode);
        return "error";
    }
}
