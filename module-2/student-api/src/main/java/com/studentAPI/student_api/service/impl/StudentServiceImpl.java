package com.studentAPI.student_api.service.impl;

import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.repository.StudentRepository;
import com.studentAPI.student_api.request.StudentRequest;
import com.studentAPI.student_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    //@Service autowired with @Repository
    @Autowired
    private StudentRepository studentRepository;

    //Here I am overriding interface method
    @Override
    public Student saveData(StudentRequest request) {

        Student s = new Student();

        s.setFirstName(request.getFirstName());
        s.setLastName(request.getLastName());
        s.setEmail(request.getEmail());
        s.setAddress(request.getAddress());

        return studentRepository.save(s);
    }

}
