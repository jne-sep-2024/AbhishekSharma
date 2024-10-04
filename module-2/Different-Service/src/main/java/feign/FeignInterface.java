package feign;

import response.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(name = "student-service", url = "http://localhost:8000")
@FeignClient(name = "student-service")
public interface FeignInterface {

    @GetMapping("/api/students")
    List<Student> getAllStudents();
}
