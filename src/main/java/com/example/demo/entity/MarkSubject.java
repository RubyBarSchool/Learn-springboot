package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MarkSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer mark;

    @ManyToOne
    @JoinColumn(name = "fk_student")
    private  Student student;
}
