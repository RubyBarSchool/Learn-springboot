package com.example.demo.ConfigurationProject;


import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
           Student truong =  new Student(1L,"Truong","Truongtv1399it@gmail.com", LocalDate.now(),21);
            Student ngoc =  new Student(2L,"Ngoc","Ngocvuive9x@gmail.com", LocalDate.now(),21);
            studentRepository.saveAll(List.of(truong,ngoc));
        };
    }

}
