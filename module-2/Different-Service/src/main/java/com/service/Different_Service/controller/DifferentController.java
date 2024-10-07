package com.service.Different_Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/different")
public class DifferentController {

    @GetMapping
    public String hello() {
        return "Hello";
    }

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @GetMapping("/api/students")
//    public List<Student> getAllStudents() {
//        return ResponseEntity.ok("Test Response");
//    }


//    private final DifferentService differentService;
//
//    @Autowired
//    public DifferentController(DifferentService differentService) {
//        this.differentService = differentService;
//    }


//    @GetMapping("/students")
//    public ResponseEntity<List<Student>> getAllStudents() {
//
//        List<Student> students = differentService.getAllStudents();
//        return ResponseEntity.ok(students);
//    }


//    @GetMapping("/students")
//    public ResponseEntity<String> getAllStudents() {
//        return ResponseEntity.ok("Test Response");
//    }

//    @GetMapping("/test")
//    public ResponseEntity<String> test() {
//        return ResponseEntity.ok("Okay");
//    }

//    @PostConstruct
//    public void init() {
//        System.out.println("DifferentController initialized!");
//    }


}
