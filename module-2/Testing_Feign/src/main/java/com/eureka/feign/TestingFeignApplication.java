package com.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableEurekaServer
@EnableFeignClients
public class TestingFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingFeignApplication.class, args);
    }

}
