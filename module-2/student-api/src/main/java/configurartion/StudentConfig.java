package configurartion;

import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.repository.BasicUserInfoDTO;
import com.studentAPI.student_api.request.StudentRequest;
import com.studentAPI.student_api.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.UUID;

@Configuration
public class StudentConfig {

    @Bean
    public StudentService studentBean(){
        return new StudentService() {
            @Override
            public Student saveData(StudentRequest student) {
                return null;
            }

            @Override
            public List<Student> getAllStudents() {
                return List.of();
            }

            @Override
            public Student getStudentByUuid(UUID studentId) {
                return null;
            }

            @Override
            public Student getStudentById(Long id) {
                return null;
            }

            @Override
            public boolean deleteByUuid(UUID uuid) {
                return false;
            }

            @Override
            public Student updateByUuid(UUID uuid, StudentRequest studentRequest) {
                return null;
            }

            @Override
            public List<Student> getAllDataJPQL() {
                return List.of();
            }

            @Override
            public List<Student> getAllDataNQ() {
                return List.of();
            }

            @Override
            public List<BasicUserInfoDTO> getSomeUserData() {
                return List.of();
            }
        };
    }
}
