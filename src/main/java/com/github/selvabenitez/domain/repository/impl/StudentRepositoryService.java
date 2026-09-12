/*package com.github.selvabenitez.domain.repository.impl;

import com.github.selvabenitez.domain.models.StudentModel;
import com.github.selvabenitez.domain.repository.StudentRepository;

/* JPA IMPORTACIONES no corresponden a semana 02
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import java.util.function.Function;
*/
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepositoryService implements StudentRepository {

    // Simulación de base de datos en memoria para el Bloque 1
    private final List<StudentModel> database = new ArrayList<>();
    private Long sequenceId = 1L;

    // --- MÉTODOS ACTIVOS BLOQUE 1 ---

    @Override
    public List<StudentModel> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public StudentModel save(StudentModel student) {
        if (student.getId() == null) {
            student.setId(sequenceId++);
            database.add(student);
        } else {
            deleteById(student.getId());
            database.add(student);
        }
        return student;
    }

    @Override
    public Optional<StudentModel> findById(Long id) {
        return database.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();
    }

    @Override
    public Boolean existByEmail(String email) {
        return database.stream()
                .anyMatch(s -> s.getEmail().equalsIgnoreCase(email));
    }

    @Override
    public Optional<StudentModel> findByEmail(String email) {
        return database.stream()
                .filter(s -> s.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }

    @Override
    public List<StudentModel> findByNameContaining(String text) {
        return database.stream()
                .filter(s -> s.getFirstName().toLowerCase().contains(text.toLowerCase()))
                .toList();
    }

    public boolean deleteById(Long id) {
        return database.removeIf(s -> s.getId().equals(id));
    }

    /* =========================================================================
     *  CÓDIGO SPRING DATA JPA (RESERVADO PARA SEMANAS 4 / 5)
     * =========================================================================

    @Override
    public <S extends StudentModel> List<S> saveAll(Iterable<S> entities) { return List.of(); }

    @Override
    public boolean existsById(Long aLong) { return false; }

    @Override
    public List<StudentModel> findAllById(Iterable<Long> longs) { return List.of(); }

    @Override
    public long count() { return 0; }

    @Override
    public void deleteById(Long aLong) {}

    @Override
    public void delete(StudentModel entity) {}

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {}

    @Override
    public void deleteAll(Iterable<? extends StudentModel> entities) {}

    @Override
    public void deleteAll() {}

    @Override
    public void flush() {}

    @Override
    public <S extends StudentModel> S saveAndFlush(S entity) { return null; }

    @Override
    public <S extends StudentModel> List<S> saveAllAndFlush(Iterable<S> entities) { return List.of(); }

    @Override
    public void deleteAllInBatch(Iterable<StudentModel> entities) {}

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {}

    @Override
    public void deleteAllInBatch() {}

    @Override
    public StudentModel getOne(Long aLong) { return null; }

    @Override
    public StudentModel getById(Long aLong) { return null; }

    @Override
    public StudentModel getReferenceById(Long aLong) { return null; }

    @Override
    public <S extends StudentModel> Optional<S> findOne(Example<S> example) { return Optional.empty(); }

    @Override
    public <S extends StudentModel> List<S> findAll(Example<S> example) { return List.of(); }

    @Override
    public <S extends StudentModel> List<S> findAll(Example<S> example, Sort sort) { return List.of(); }

    @Override
    public <S extends StudentModel> Page<S> findAll(Example<S> example, Pageable pageable) { return null; }

    @Override
    public <S extends StudentModel> long count(Example<S> example) { return 0; }

    @Override
    public <S extends StudentModel> boolean exists(Example<S> example) { return false; }

    @Override
    public <S extends StudentModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) { return null; }

    @Override
    public List<StudentModel> findAll(Sort sort) { return List.of(); }

    @Override
    public Page<StudentModel> findAll(Pageable pageable) { return null; }


}
*/