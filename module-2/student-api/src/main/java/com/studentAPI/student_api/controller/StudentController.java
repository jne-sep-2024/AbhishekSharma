package com.studentAPI.student_api.controller;

import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.request.StudentRequest;
import com.studentAPI.student_api.service.StudentResponse;
import com.studentAPI.student_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentResponse studentResponse;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentRequest studentRequest) {
        Student savedStudent = studentService.saveData(studentRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }

    @GetMapping
    public List<StudentResponse> getAllStudents() {

        // Fetching all students
        List<Student> students = studentResponse.getAllData();

        return students.stream().map(this::mapToStudentResponse).collect(Collectors.toList());
    }

    private StudentResponse mapToStudentResponse(Student student) {
        return studentResponseService.getAllData(new StudentRequest(student.getId(), student.getUuid(),
                student.getFirstName(), student.getLastName(), student.getEmail(), student.getAddress()));
    }

}
