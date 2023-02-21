package com.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/testing")
    public String helloTesting() {
        return "Hello Controller - JUnit 5 and Mockito !";
    }
}
