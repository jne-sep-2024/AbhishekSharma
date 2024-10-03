package feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "student-service", url = "http://localhost:8081/api/students")
public interface FeignInterface {

    @GetMapping
    List<Student> getAllStudent();
}
