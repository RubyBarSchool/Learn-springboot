package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private Long id;
    private String name;

    @OneToOne
    private Student student;

}
