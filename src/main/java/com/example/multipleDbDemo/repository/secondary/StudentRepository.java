package com.example.multipleDbDemo.repository.secondary;

import com.example.multipleDbDemo.entity.secondary.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
