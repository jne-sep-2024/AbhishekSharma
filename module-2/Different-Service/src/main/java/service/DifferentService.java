package service;

import feign.FeignInterface;
import feign.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DifferentService {

    @Autowired
    private FeignInterface feignInterface;

    public List<Student> fetchAllStudent() {
        return feignInterface.getAllStudent();
    }
}
