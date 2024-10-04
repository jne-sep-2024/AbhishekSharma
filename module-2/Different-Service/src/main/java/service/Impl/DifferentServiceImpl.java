package service.Impl;

import feign.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import response.Student;

import java.util.List;

@Service
public class DifferentServiceImpl {

    private final FeignInterface feignInterface;

    @Autowired
    public DifferentServiceImpl(FeignInterface feignInterface) {
        this.feignInterface = feignInterface;
    }

    public List<Student> getAllStudents() {
        return feignInterface.getAllStudents();
    }
}
