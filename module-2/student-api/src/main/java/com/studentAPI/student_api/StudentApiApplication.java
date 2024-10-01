package com.studentAPI.student_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentApiApplication {

    public static void main(String[] args) {

        //Here I am telling boot to look for application.yml
        //I found this is not mandatory
        System.setProperty("spring.config.name", "application");
        SpringApplication.run(StudentApiApplication.class, args);
    }


}
