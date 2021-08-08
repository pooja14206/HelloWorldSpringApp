package com.org.HelloWorldSpringApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/*
    Display Hello Bridgelabz in web using MVC controller
*/
@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String hello(){return "hello";}
/*
    Display a customized message in webpage
 */
    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","This is a coustom message: Hello From Bridgelabz");
        return "message";
    }
}
