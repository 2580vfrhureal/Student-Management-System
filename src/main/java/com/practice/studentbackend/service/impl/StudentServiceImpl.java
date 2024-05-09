package com.practice.studentbackend.service.impl;

import com.practice.studentbackend.dto.StudentDto;
import com.practice.studentbackend.entity.Student;
import com.practice.studentbackend.mapper.StudentMapper;
import com.practice.studentbackend.repository.StudentRepository;
import com.practice.studentbackend.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service // create bean
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    @Override
    public StudentDto createStudent(StudentDto studentDto) {

        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);

        return StudentMapper.mapToStudentDto(savedStudent);
    }
}
