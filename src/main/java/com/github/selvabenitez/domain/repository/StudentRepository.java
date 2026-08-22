package com.github.selvabenitez.domain.repository;

import com.github.selvabenitez.domain.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository <StudentModel, Long> {
    List<StudentModel> findAll();
    StudentModel save(StudentModel student);
    Optional<StudentModel> findById(Long id);
    Boolean existByEmail(String email);
    Optional<StudentModel> findByEmail(String email);
    List<StudentModel> findByNameContaining(String text);
}