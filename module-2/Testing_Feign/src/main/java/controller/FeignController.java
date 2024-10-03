package controller;

import feign.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.impl.tempImpl;

import java.util.List;

@RestController
public class FeignController {

    @Autowired
    private tempImpl tempServiceFeign;

    //Here I am creating a mapping for fetching-student
    @GetMapping("/fetch-students")
    public ResponseEntity<List<Student>> getAllStudentsFeign() {

        List<Student> students = tempServiceFeign.getAllStudents();
        return ResponseEntity.ok(students);
    }
}
