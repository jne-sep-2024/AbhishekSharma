package com.studentAPI.student_api.repository;

import com.studentAPI.student_api.entity.Student;
import jakarta.persistence.Id;
import org.hibernate.sql.Delete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //If we want to add any other functionality

    Optional<Student> findByUuid(UUID studentUuid);


    //Delete a row using uuid
    @Modifying
    @Query("DELETE FROM Student s WHERE s.uuid = ?1")
    void deleteByUuid(UUID uuid);

}
