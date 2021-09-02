package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CalculatorStudent {
    List<Student> getAllStudent();
    Boolean addStudent(Student student);
    Boolean deleteStudent(Long id);
}
