package com.differentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DifferentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DifferentServiceApplication.class, args);
    }

}
