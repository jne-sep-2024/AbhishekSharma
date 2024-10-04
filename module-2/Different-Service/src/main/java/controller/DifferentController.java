package controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DifferentService;

@RestController
@RequestMapping("/api/different")
public class DifferentController {

    private final DifferentService differentService;

    @Autowired
    public DifferentController(DifferentService differentService) {
        this.differentService = differentService;
    }


//    @GetMapping("/students")
//    public ResponseEntity<List<Student>> getAllStudents() {
//
//        List<Student> students = differentService.getAllStudents();
//        return ResponseEntity.ok(students);
//    }


    @GetMapping("/students")
    public ResponseEntity<String> getAllStudents() {
        return ResponseEntity.ok("Test Response");
    }

//    @GetMapping("/test")
//    public ResponseEntity<String> test() {
//        return ResponseEntity.ok("Okay");
//    }

//    @PostConstruct
//    public void init() {
//        System.out.println("DifferentController initialized!");
//    }


}
