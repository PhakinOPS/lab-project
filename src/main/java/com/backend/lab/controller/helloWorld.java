package com.backend.lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @GetMapping("/hello")
    public String hello(){
        String res = "Hello World!!!";
        return res;
    }
}
