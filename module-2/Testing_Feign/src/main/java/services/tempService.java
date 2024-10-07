package services;

import feign.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface tempService {
//
//    @Autowired
//    private tempRepository repository;

    List<Student> getAllStudents();
}
