package com.studentAPI.student_api.controller;

import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.request.StudentRequest;
import com.studentAPI.student_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentRequest studentRequest) {
        Student savedStudent = studentService.saveData(studentRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }

//    @GetMapping
//    public ResponseEntity<List<Student>> getAllStudents() {
//        List<Student> students = studentService.getAllStudents();
//        return ResponseEntity.ok(students);
//    }
}
