package com.example.vulnerabilities.controller;

import org.fluentd.logger.FluentLogger;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@RestController
public class pingController {

    private static FluentLogger LOG = FluentLogger.getLogger("fluentd.test");

    @RequestMapping(value={"/ping"})
    public String returnPong(){
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("from", "userA");
        data.put("to", "userB");
        LOG.log("follow", data);
        return "pong";
    }

}
