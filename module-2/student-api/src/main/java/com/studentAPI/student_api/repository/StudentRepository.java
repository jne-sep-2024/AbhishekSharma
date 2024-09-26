package com.studentAPI.student_api.repository;

import com.studentAPI.student_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //If we want to add any other functionality
}
