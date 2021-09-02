package com.example.demo.entity;

import javax.persistence.*;

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
