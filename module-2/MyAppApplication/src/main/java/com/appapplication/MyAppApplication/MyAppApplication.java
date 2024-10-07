package com.appapplication.MyAppApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MyAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

        var obj = context.getBean(Dev.class);
        obj.build();


        //this will create object in JVM but we don't want that
//        Dev obj = new Dev();
//        obj.build();

    }

}
