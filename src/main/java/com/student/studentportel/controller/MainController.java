package com.student.studentportel.controller;

import com.student.studentportel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public String index(){
        return "login";
    }

    @GetMapping("{id}")
    public String studentById(@PathVariable long id){
        studentService.studentById(id);
        return "page";
    }
}
