package com.github.selvabenitez.Application.service.impl;

import com.github.selvabenitez.Application.service.StudentService;
import com.github.selvabenitez.domain.Exception.StudentNotFoundException;
import com.github.selvabenitez.domain.models.StudentModel;
import com.github.selvabenitez.domain.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentModel> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentModel save(StudentModel student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<StudentModel> findById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Boolean existByEmail(String email) {
        return studentRepository.existByEmail(email);
    }


    @Override
    public StudentModel getById(long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Estudiante no encontrado con ID: " + id));
    }

    @Override
    public Optional<StudentModel> findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public List<StudentModel> searchByName(String text) {
        if (text == null || text.trim().isEmpty()) {
            return List.of();
        }
        return studentRepository.findByNameContaining(text.trim());
    }
}