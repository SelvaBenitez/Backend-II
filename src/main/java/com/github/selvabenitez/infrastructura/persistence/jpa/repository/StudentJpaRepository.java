package com.github.selvabenitez.infrastructura.persistence.jpa.repository;

import com.github.selvabenitez.infrastructura.persistence.jpa.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentJpaRepository extends JpaRepository<StudentEntity, Long> {

    boolean existsByEmail(String email);

    Optional<StudentEntity> findByEmail(String email);

    List<StudentEntity> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String firstName, String lastName);
}