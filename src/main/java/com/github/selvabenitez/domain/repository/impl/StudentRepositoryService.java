package com.github.selvabenitez.domain.repository.impl;

import com.github.selvabenitez.domain.models.StudentModel;
import com.github.selvabenitez.domain.repository.StudentRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public abstract class StudentRepositoryService implements StudentRepository {
    private final StudentRepository studentRepository;

    public StudentRepositoryService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public <S extends StudentModel> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<StudentModel> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<StudentModel> findAll() {
        return List.of();
    }

    @Override
    public List<StudentModel> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(StudentModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends StudentModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public StudentModel save(StudentModel student) {
        return null;
    }



    @Override
    public Boolean existByEmail(String email) {
        return null;
    }

    @Override
    public Optional<StudentModel> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<StudentModel> findByNameContaining(String text) {
        return List.of();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends StudentModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends StudentModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<StudentModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public StudentModel getOne(Long aLong) {
        return null;
    }

    @Override
    public StudentModel getById(Long aLong) {
        return null;
    }

    @Override
    public StudentModel getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends StudentModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends StudentModel> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends StudentModel> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends StudentModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends StudentModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends StudentModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends StudentModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public List<StudentModel> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<StudentModel> findAll(Pageable pageable) {
        return null;
    }
}
