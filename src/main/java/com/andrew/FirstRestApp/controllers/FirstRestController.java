package com.andrew.FirstRestApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/api")
public class FirstRestController {

    //@ResponseBody
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello World";
    }

}
