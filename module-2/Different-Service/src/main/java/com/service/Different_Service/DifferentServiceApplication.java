package com.service.Different_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DifferentServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(DifferentServiceApplication.class, args);
    }


}
