package com.github.selvabenitez.Application.service;

import com.github.selvabenitez.domain.models.StudentModel;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<StudentModel> findAll();
    StudentModel save(StudentModel student);
    Optional<StudentModel> findById(long id);
    Boolean existByEmail(String email);

    StudentModel getById(long id);
    Optional<StudentModel> findByEmail(String email);
    List<StudentModel> searchByName(String text);
}