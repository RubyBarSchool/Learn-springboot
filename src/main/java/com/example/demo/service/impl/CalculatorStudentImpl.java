package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.CalculatorStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorStudentImpl implements CalculatorStudent {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Boolean addStudent(Student student) {
        return studentRepository.save(student) != null;
    }

    @Override
    public Boolean deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return true;
    }
}
