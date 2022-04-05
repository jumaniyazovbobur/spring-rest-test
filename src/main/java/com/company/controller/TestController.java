package com.company.controller;

import com.company.entity.StudentEntity;
import com.company.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController("")
public class TestController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/test")
    public String test() {
        return "Test String Mazgi.";
    }

    @GetMapping("")
    public String init() {
        return "Init Method Mazgi.";
    }

    @GetMapping("/student/list")
    public List<StudentEntity> studentList() {
        return studentService.list();
    }

    @GetMapping("/student/create")
    public String studentCreate() {
        studentService.create();
        return "New Student Created";
    }


}
