package com.studentAPI.student_api.service;

import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.request.StudentRequest;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    Student saveData(StudentRequest student);


    //I am creating this method to get all data from DB
    List<Student> getAllStudents();

    //Find by UUID
    Student getStudentByUuid(UUID studentId);

    //Find by Id
    Student getStudentById(Long id);

    //Delete a row
    boolean deleteByUuid(UUID uuid);

    //Update a row
    Student updateByUuid(UUID uuid, StudentRequest studentRequest);
}
