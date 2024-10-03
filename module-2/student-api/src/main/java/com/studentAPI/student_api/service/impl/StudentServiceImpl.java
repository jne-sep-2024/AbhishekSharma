package com.studentAPI.student_api.service.impl;

import com.studentAPI.student_api.repository.BasicUserInfoDTO;
import com.studentAPI.student_api.entity.Student;
import com.studentAPI.student_api.repository.StudentRepository;
import com.studentAPI.student_api.request.StudentRequest;
import com.studentAPI.student_api.service.StudentService;//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    //@Service autowired with @Repository
    @Autowired
    private StudentRepository studentRepository;

    //Here I am overriding interface method
    @Override
    public Student saveData(StudentRequest request) {

        Student s = new Student();

        s.setFirstName(request.getFirstName());
        s.setLastName(request.getLastName());
        s.setEmail(request.getEmail());
        s.setAddress(request.getAddress());

        return studentRepository.save(s);
    }

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByUuid(UUID studentId) {
        return studentRepository.findByUuid(studentId).orElse(null);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public boolean deleteByUuid(UUID uuid) {

        if (studentRepository.findByUuid(uuid).isPresent()) {
            studentRepository.deleteByUuid(uuid);
            return true;
        }
        return false;
    }

    @Override
    public Student updateByUuid(UUID uuid, StudentRequest studentRequest) {

        Student existingStudent = studentRepository.findByUuid(uuid).orElse(null);

        if (existingStudent != null) {

            existingStudent.setFirstName(studentRequest.getFirstName());
            existingStudent.setLastName(studentRequest.getLastName());
            existingStudent.setEmail(studentRequest.getEmail());
            existingStudent.setAddress(studentRequest.getAddress());

            return studentRepository.save(existingStudent);
        } else {
            return null;
        }
    }

    @Override
    public List<Student> getAllDataJPQL() {
        return studentRepository.getAllDataJPQL();
    }

    @Override
    public List<Student> getAllDataNQ() {
        return studentRepository.getAllDataNQ();
    }

    @Override
    public List<BasicUserInfoDTO> getSomeUserData() {

        return studentRepository.findAllUserBasicInfo();
    }


}
