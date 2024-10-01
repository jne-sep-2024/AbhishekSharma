package com.studentAPI.student_api.controller;

import com.studentAPI.student_api.repository.BasicUserInfoDTO;
import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.request.StudentRequest;
import com.studentAPI.student_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<Student> getStudentByUuid(@PathVariable UUID uuid) {

        Student student = studentService.getStudentByUuid(uuid);

        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    //Delete a row using uuid
    @DeleteMapping("/uuid/{uuid}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID uuid) {

        boolean isDeleted = studentService.deleteByUuid(uuid);

        if (isDeleted) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/update/uuid/{uuid}")
    public ResponseEntity<Student> updateByUuid(@PathVariable UUID uuid, @RequestBody StudentRequest studentRequest) {

        Student updatedStudent = studentService.updateByUuid(uuid, studentRequest);
        if (updatedStudent != null) {
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/jpql")
    public ResponseEntity<List<Student>> getAllDataJPQL() {

        List<Student> students = studentService.getAllDataJPQL();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/nq")
    public ResponseEntity<List<Student>> getAllDataNQ() {
        List<Student> students = studentService.getAllDataNQ();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/specific/data")
    public ResponseEntity<List<BasicUserInfoDTO>> getSomeUserData() {
        List<BasicUserInfoDTO> specificNames = studentService.getSomeUserData();
        return ResponseEntity.ok(specificNames);
    }

}
