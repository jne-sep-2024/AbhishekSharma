package com.studentAPI.student_api.service;

import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.request.StudentRequest;

public interface StudentService {

    Student saveData(StudentRequest student);
}
