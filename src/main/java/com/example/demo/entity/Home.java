package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Home {
    @Id
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "tb_home_student",
    joinColumns = {@JoinColumn(name = "homeID")},
    inverseJoinColumns = {@JoinColumn(name = "studentID")})
    private Set<Student> studentSet = new HashSet<>();
}
