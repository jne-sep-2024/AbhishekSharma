package com.appapplication.MyAppApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile() {
        System.out.println("Laptop");
    }


//    public void insert() {
//
//        System.out.println("Getting 404 error");
//    }

}
