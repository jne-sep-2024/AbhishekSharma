package com.example_springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRespository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;


    public static String INSERT_QUERY =

            """
                    insert into course(id, name, author)
                    values (1, 'Spring boot', 'Rod Johnson');  
                    
                    insert into course(id, name, author)
                    values (2, 'Java', 'James Gosling');
                    
                    delete from course where id = 1;
                    """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
