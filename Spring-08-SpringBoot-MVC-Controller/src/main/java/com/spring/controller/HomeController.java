package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping
    public String getRequestMapping() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ilker")
    public String getRequestMapping2() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/merry")
    public String getRequestMapping3() {
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingExample() {
        return "home";
    }

    @PostMapping("/spring")
    public String getMappingExample2() {
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String getVariableEx(@PathVariable("name") String name, @PathVariable("email") String email) {
        System.out.println("Name is " + name);
        System.out.println("Email is " + email);
        return "home";
        //http://localhost:8080/home/apple/apple@apple.com
    }

    @GetMapping("home/course")
    public String requestParamEx(@RequestParam("course") String course) {
        System.out.println("Name is " + course);
        return "home";
        //http://localhost:8080/home/course?course=spring
    }

    @GetMapping(value = "/course")
    public String requestParamEx2(@RequestParam(value = "name", required = false, defaultValue = "merry") String name) {
        System.out.println("Name is " + name);
        return "home";
        //http://localhost:8080/course  -->Name is merry
    }
}
