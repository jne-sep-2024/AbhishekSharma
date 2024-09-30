package com.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {

        return Arrays.asList(
                new Course(1, "AWS", "A"),
                new Course(2, "Spring", "S")
        );
    }
}
