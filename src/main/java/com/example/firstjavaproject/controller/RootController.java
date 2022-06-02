package com.example.firstjavaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @RequestMapping(value="/")
    public String index() {
        System.out.println("test !!!!!!");
        return "index";
    }

}
