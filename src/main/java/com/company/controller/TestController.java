package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Test String Mazgi.";
    }

    @GetMapping("")
    public String init() {
        return "Init Method Mazgi.";
    }

}
