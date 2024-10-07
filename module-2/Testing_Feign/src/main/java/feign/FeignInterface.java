package feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "student-registry", path = "/api/students")
public interface FeignInterface {

     @GetMapping
    public List<Student> getAllStudents();

}
