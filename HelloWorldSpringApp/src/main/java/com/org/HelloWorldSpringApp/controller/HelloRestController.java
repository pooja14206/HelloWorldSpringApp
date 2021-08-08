package com.org.HelloWorldSpringApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    using rest controller to response to rest request
 */

@RestController
@RequestMapping("/hello")
public class HelloRestController{
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello(){
        return "Hello I am From Bridgelabz";
    }
}