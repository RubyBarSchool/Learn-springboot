package com.example.demo.controller;

import com.example.demo.ConfigurationProject.Response;
import com.example.demo.entity.Student;
import com.example.demo.service.CalculatorStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity getallStudent(){
        Response response = new Response();
        response.setValue(calculatorStudent.getAllStudent());
        response.setMessage(HttpStatus.OK+"");
        return new ResponseEntity(response, HttpStatus.OK);
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
