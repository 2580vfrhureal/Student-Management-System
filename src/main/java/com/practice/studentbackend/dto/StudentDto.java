package com.practice.studentbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {// between client and server, response rest apis
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
