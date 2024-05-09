package com.practice.studentbackend.service;

import com.practice.studentbackend.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);

    StudentDto getStudentById(Long studentId);

    List<StudentDto> getAllStudents();
}
