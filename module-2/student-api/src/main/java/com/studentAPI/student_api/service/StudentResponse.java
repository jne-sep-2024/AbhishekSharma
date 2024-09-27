package com.studentAPI.student_api.service;

import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.request.StudentFetch;

public interface StudentResponse {

    Student getAllData(StudentFetch studentFetch);

}
