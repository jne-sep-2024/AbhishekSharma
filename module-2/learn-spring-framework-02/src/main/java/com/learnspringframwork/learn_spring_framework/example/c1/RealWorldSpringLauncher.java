package com.learnspringframwork.learn_spring_framework.example.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldSpringLauncher {

    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext
                (RealWorldSpringLauncher.class)) {

           // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            //We want to print beans present in BusinessCalculationService
            var bean = context.getBean(BusinessCalculationService.class).findMax();

            System.out.println(bean);
        }
    }
}
