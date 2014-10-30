package com.realdolmen.controller;

import com.realdolmen.util.LoggerProducer;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
@Controller
public class CarController {

    @LoggerProducer
    private Logger logger;


    @RequestMapping("/")
    public String home() {
        logger.info("foobar");
        return "index";
    }


}
