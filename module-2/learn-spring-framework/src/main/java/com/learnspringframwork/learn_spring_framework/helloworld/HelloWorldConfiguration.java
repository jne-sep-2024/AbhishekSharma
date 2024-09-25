package com.learnspringframwork.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Adding address to a person object
record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {
//Here we can defined spring beans

    @Bean
    public String name() {
        return "Abhishek";
    }

    @Bean
    public int age() {
        return 26;
    }

//    @Bean
//    public String address() {
//        return "Varanasi";
//    }

    @Bean
    @Primary
    public Person person() {

        return new Person("Rohit", 26, new Address(" Rohit Amber Apartment", "Pune"));
    }

    @Bean
    public Person person2MethodCall() {

        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address3) {

        return new Person(name, age, address3());
    }

    @Bean
    public Person person4Parameter(String name, int age, @Qualifier("address4qualifier") Address address4) {

        return new Person(name, age, address4);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Amber Apartment", "Pune");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("LIC", "Varanasi");
    }

    @Bean(name = "address4")
    @Qualifier("address4qualifier")
    public Address address4() {
        return new Address("LIC", "Varanasi");
    }

}
