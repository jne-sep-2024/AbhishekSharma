package services.impl;

import feign.FeignInterface;
import feign.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.tempService;

import java.util.List;

@Service
public class tempImpl implements tempService {

    @Autowired
    private FeignInterface feignInterface;

    public List<Student> getAllStudents() {
        return feignInterface.getAllStudents();
    }
}
