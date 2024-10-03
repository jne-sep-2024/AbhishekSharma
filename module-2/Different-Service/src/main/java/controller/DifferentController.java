package controller;

import feign.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DifferentService;

import java.util.List;

@RestController
//@RequestMapping("/api/different")
public class DifferentController {

    @Autowired
    private DifferentService differentService;

    @GetMapping("/feign/students")
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> students = differentService.fetchAllStudent();
        return ResponseEntity.ok(students);
    }

}
