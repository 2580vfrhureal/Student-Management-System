package com.practice.studentbackend.repository;

import com.practice.studentbackend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {// <Entity, primary key>

}
