package com.example.springprototype.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "Greeting from Spring Boot!";
    }
}
