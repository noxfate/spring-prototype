package com.example.springprototype.controller;

import com.example.springprototype.bean.MasterResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public MasterResponse handle(){
        MasterResponse response = new MasterResponse();
        response.setCode(0);
        response.setTest("Hello world");
        return response;
    }
}
