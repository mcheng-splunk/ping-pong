package com.example.vulnerabilities.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class pingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(pingController.class);

    @RequestMapping(value={"/ping"})
    public String returnPong(){
        LOGGER.info("returning from " + getClass().getName());
        return "pong";
    }

}
