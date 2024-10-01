package com.postgres.springboot_postgres.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //Create the table
    public void insert() {

        try {
            var query = "CREATE TABLE IF NOT EXISTS student(id BIGSERIAL PRIMARY KEY, name VARCHAR(255), city VARCHAR(255));";
            var create = this.jdbcTemplate.update(query);
            System.out.println("Table Created" + create);

        } catch (DataAccessException e) {
            System.out.println(e.getMessage());
        }

    }

    //inserting data
    public void insertData(String name, String city) {

        try {
            var insert = "INSERT INTO student(name, city) VALUES(?,?)";
            var create = this.jdbcTemplate.update(insert, name, city);
            System.out.println("Inserting Data: " + create);

        } catch (DataAccessException e) {

            System.out.println(e.getMessage());
        }

    }

    public List<Map<String, Object>> getAllStudents() {


        var query = "SELECT * FROM student";
        return jdbcTemplate.queryForList(query);

    }

}


