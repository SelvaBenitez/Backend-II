package com.github.selvabenitez.domain.repository;

import com.github.selvabenitez.domain.models.StudentModel;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    List<StudentModel> findAll();
    StudentModel save(StudentModel student);
    Optional<StudentModel> findById(Long id);
    Boolean existByEmail(String email);
    Optional<StudentModel> findByEmail(String email);
    List<StudentModel> findByNameContaining(String text);
}