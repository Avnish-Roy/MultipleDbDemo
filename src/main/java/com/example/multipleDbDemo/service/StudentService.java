package com.example.multipleDbDemo.service;

import com.example.multipleDbDemo.entity.secondary.Student;
import com.example.multipleDbDemo.repository.secondary.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void saveStudent(com.example.multipleDbDemo.entity.secondary.Student student) {
        studentRepository.save(student);
    }
    public List<Student> getAllStudents() {
      return  studentRepository.findAll();
    }
}
