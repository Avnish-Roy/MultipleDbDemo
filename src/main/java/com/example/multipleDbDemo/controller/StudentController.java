package com.example.multipleDbDemo.controller;


import com.example.multipleDbDemo.entity.secondary.Student;
import com.example.multipleDbDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(Student student) {
        studentService.saveStudent(student);
        return ResponseEntity.ok("student added successfully");
    }

    @PostMapping("/getStudents")
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
