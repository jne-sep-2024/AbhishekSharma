package com.differentservice.controller;

import com.differentservice.feign.FeignInterface;
import com.differentservice.response.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class differentController {

    @Autowired
    private FeignInterface feignInterface;

    @GetMapping("/feign")
    public List<Student> getAllStudents() {
        return feignInterface.getAllStudents();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
