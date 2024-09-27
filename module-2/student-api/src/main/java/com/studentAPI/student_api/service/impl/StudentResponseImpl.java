package com.studentAPI.student_api.service.impl;

import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.repository.StudentRepository;
import com.studentAPI.student_api.request.StudentFetch;
import com.studentAPI.student_api.service.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentResponseImpl implements StudentResponse {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getAllData(StudentFetch studentFetch) {

        if (studentFetch.getId() != 0) {
            return studentRepository.findById(studentFetch.getId()).orElse(null);  // Fetch by ID
        }

        return null;
    }
}
