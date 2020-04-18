package com.gamestation.demoservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name){
        return "Hello " + name + ", welcome to the GameStation";
    }
}
