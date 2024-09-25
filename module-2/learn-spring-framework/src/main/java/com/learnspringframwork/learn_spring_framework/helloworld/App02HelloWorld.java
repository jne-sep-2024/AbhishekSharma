package com.learnspringframwork.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class App02HelloWorld {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)
        ) {

            //1: Create a spring context

            //2: Configure the things that we want Spring to manage - @Configuration annotation
            //HelloWorldConfiguration - @Configuration
            //name - @Bean

            //3: Retrieving Beans managed by spring
            var name = context.getBean("name");
            System.out.println(name);

            System.out.println(context.getBean("age"));

            //Renamed it in HelloWorldConfiguration.java
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));

            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println("person 3:" + context.getBean("person3Parameter"));
            System.out.println("Person 4: " + context.getBean("person4Parameter"));

            //It will print all the beans names
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }

    }
}
