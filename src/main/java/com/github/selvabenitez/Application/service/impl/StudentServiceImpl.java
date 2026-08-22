package com.github.selvabenitez.Application.service.impl;

import com.github.selvabenitez.Application.service.StudentService;
import com.github.selvabenitez.domain.Exception.StudentNotFoundException;
import com.github.selvabenitez.domain.models.StudentModel;
import com.github.selvabenitez.domain.repository.StudentRepository;
import com.github.selvabenitez.domain.repository.impl.StudentRepositoryService;
import org.jspecify.annotations.Nullable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StudentServiceImpl implements StudentService {

   private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List saveAll(Iterable entities) {
        return List.of();
    }

    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Optional findById(Object o) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Object o) {
        return false;
    }

    public List<StudentModel> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List findAllById(Iterable iterable) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Object o) {

    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public void deleteAllById(Iterable iterable) {

    }

    @Override
    public void deleteAll(Iterable entities) {

    }

    @Override
    public void deleteAll() {

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

    @Override
    public void flush() {

    }

    @Override
    public void deleteAllInBatch(Iterable entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Object getOne(Object o) {
        return null;
    }

    @Override
    public Object getById(Object o) {
        return null;
    }

    @Override
    public Object getReferenceById(Object o) {
        return null;
    }

    @Override
    public List findAll(Example example, Sort sort) {
        return List.of();
    }

    @Override
    public List findAll(Example example) {
        return List.of();
    }

    @Override
    public List saveAllAndFlush(Iterable entities) {
        return List.of();
    }

    @Override
    public Object saveAndFlush(Object entity) {
        return null;
    }

    @Override
    public List findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional findOne(Example example) {
        return Optional.empty();
    }

    @Override
    public Page findAll(Example example, Pageable pageable) {
        return null;
    }

    @Override
    public long count(Example example) {
        return 0;
    }

    @Override
    public boolean exists(Example example) {
        return false;
    }

    @Override
    public @Nullable Object findBy(Example example, Function queryFunction) {
        return null;
    }
}