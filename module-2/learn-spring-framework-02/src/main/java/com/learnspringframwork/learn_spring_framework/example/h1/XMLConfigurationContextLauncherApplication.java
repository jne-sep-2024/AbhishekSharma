package com.learnspringframwork.learn_spring_framework.example.h1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XMLConfigurationContextLauncherApplication {

    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("XmlConfiguration.xml")) {

            //To get active beans name
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            //To get output from XML
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("game"));
        }
    }
}
