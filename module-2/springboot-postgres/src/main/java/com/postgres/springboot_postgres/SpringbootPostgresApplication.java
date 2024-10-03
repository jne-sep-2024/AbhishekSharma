package com.postgres.springboot_postgres;

import com.postgres.springboot_postgres.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPostgresApplication implements CommandLineRunner {

    @Autowired
    private StudentDao studentDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPostgresApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //this.studentDao.insert();
        this.studentDao.insertData("Abhishek", "Varanasi");
        this.studentDao.insertData("Rohit", "Pune");
    }
}
