package com.github.selvabenitez.infrastructura.persistence.jpa.adapter;

import com.github.selvabenitez.domain.models.StudentModel;
import com.github.selvabenitez.domain.repository.StudentRepository;
import com.github.selvabenitez.infrastructura.persistence.jpa.entity.StudentEntity;
import com.github.selvabenitez.infrastructura.persistence.jpa.repository.StudentJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class StudentRepositoryAdapter implements StudentRepository {

    private final StudentJpaRepository jpaRepository;

    public StudentRepositoryAdapter(StudentJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<StudentModel> findAll() {
        return jpaRepository.findAll().stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public StudentModel save(StudentModel student) {
        StudentEntity entity = toEntity(student);
        StudentEntity savedEntity = jpaRepository.save(entity);
        return toModel(savedEntity);
    }

    @Override
    public Optional<StudentModel> findById(Long id) {
        return jpaRepository.findById(id).map(this::toModel);
    }

    @Override
    public Boolean existByEmail(String email) {
        return jpaRepository.existsByEmail(email);
    }

    @Override
    public Optional<StudentModel> findByEmail(String email) {
        return jpaRepository.findByEmail(email).map(this::toModel);
    }

    @Override
    public List<StudentModel> findByNameContaining(String text) {
        return jpaRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(text, text)
                .stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    // --- Mapeo Entity <-> Model ---
    private StudentModel toModel(StudentEntity entity) {
        return new StudentModel(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getBirthDate()
        );
    }

    private StudentEntity toEntity(StudentModel model) {
        return new StudentEntity(
                model.getId(),
                model.getFirstName(),
                model.getLastName(),
                model.getEmail(),
                model.getBirthDate()
        );
    }
}