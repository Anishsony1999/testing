package com.student.studentportel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping
    public String index(){
        return "login";
    }

    @GetMapping("{id}")
    public String studentById(@PathVariable int id){
        return "null";
    }
}
