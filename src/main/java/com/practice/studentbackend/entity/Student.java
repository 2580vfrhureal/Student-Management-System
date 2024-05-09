package com.practice.studentbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//automatically increment primary key
    private Long id;

    @Column(name = "first_name")// specify table column name
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id",nullable = false,unique = true)
    private String email;
}
