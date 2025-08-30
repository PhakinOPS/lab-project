package com.backend.lab.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reverseStringController {

    @GetMapping("/reverse")
    public String reverseString(@RequestParam String word){
        return new StringBuilder(word).reverse().toString();
    }
}
