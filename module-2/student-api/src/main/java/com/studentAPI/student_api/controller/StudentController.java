package com.studentAPI.student_api.controller;

import com.studentAPI.student_api.repository.BasicUserInfoDTO;
import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.repository.LimitedInfo;
import com.studentAPI.student_api.request.StudentRequest;
import com.studentAPI.student_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String homepage() {
        return "Homepage";
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentRequest studentRequest) {
        Student savedStudent = studentService.saveData(studentRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }
//
//    @GetMapping
//    public ResponseEntity<List<Student>> getAllStudents() {
//        List<Student> students = studentService.getAllStudents();
//        return ResponseEntity.ok(students);
//    }

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


    //Specifying here admin and user role
    @GetMapping
    public ResponseEntity<?> responseEntity() {

        //Get the current user's authentication
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String role = authentication.getAuthorities().iterator().next().getAuthority();

        if (role.equals("ROLE_ADMIN")) {
            List<Student> students = studentService.getAllStudents();
            return ResponseEntity.ok(students);
        } else if (role.equals("ROLE_USER")) {

            List<LimitedInfo> limitedInfos = studentService.getAllStudents()
                    .stream()
                    .map(student -> new LimitedInfo(student.getFirstName(), student.getLastName()))
                    .collect(Collectors.toList());
            return ResponseEntity.ok(limitedInfos);

        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Access Denied");
        }
    }


}
