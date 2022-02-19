package com.example.vulnerabilities.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class pingController {

    @RequestMapping(value={"/ping"})
    public String returnPong(){
        return "pong";
    }
}
