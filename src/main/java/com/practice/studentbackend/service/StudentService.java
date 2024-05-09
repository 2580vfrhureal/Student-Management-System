package com.practice.studentbackend.service;

import com.practice.studentbackend.dto.StudentDto;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);

    StudentDto getStudentById(Long studentId);
}
