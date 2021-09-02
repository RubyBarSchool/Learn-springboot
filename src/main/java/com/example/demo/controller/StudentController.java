package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.CalculatorStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController {
    @Autowired
    private CalculatorStudent calculatorStudent;

    @GetMapping
    public List<Student> getallStudent(){
        return calculatorStudent.getAllStudent();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        calculatorStudent.addStudent(student);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteStudent(@PathVariable Long id){
        calculatorStudent.deleteStudent(id);
    }


}
