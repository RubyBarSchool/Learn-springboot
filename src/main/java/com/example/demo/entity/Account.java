package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
//@IdClass(KeyOfAccount.class)
@NoArgsConstructor
@AllArgsConstructor
public class Account {
//    @Id
//    private String name;
//    @Id
//    private String email;
    @EmbeddedId
    private KeyOfAccountType2 keyOfAccountType2;

    private Integer age;

}
