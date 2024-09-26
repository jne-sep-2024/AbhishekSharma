package com.appapplication.MyAppApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //Field Injection
    @Autowired //field injection
    private Computer computer;

//    //Constructor Injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

    //Setter Injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {

        //  computer.insert();
        computer.compile();
        System.out.println("My first Application");
    }

}
