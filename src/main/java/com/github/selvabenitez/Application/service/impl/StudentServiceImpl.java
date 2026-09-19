package com.github.selvabenitez.Application.service.impl;

import com.github.selvabenitez.Application.service.StudentService;
import com.github.selvabenitez.domain.Exception.StudentNotFoundException;
import com.github.selvabenitez.domain.models.StudentModel;
import com.github.selvabenitez.domain.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
    public Optional<StudentModel> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Boolean existByEmail(String email) {
        return studentRepository.existByEmail(email);
    }

    @Override
    public StudentModel getById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    @Override
    public Optional<StudentModel> findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public List<StudentModel> searchByName(String text) {
        return studentRepository.findByNameContaining(text);
    }
}