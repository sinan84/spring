package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ilker")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping("/merry")
    public String getRequestMapping3(){
        return "home";
    }
}
