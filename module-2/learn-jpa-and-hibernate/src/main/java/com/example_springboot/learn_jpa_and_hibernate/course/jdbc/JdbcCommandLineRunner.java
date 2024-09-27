package com.example_springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRespository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.insert();
    }
}
