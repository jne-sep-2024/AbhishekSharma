package com.differentservice.feign;

import com.differentservice.response.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "student-service", url = "http://localhost:8081")
public interface FeignInterface {

    @GetMapping("/api/students")
    List<Student> getAllStudents();

}
