package com.github.selvabenitez.infrastructura.persistence.jpa.repository;

import com.github.selvabenitez.domain.models.EnrollmentStatus;
import com.github.selvabenitez.infrastructura.persistence.jpa.entity.EnrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentJpaRepository extends JpaRepository<EnrollmentEntity, Long> {
    boolean existsByStudentIdAndCourseId(Long studentId, Long courseId);
    long countByCourseIdAndStatus(Long courseId, EnrollmentStatus status);
    List<EnrollmentEntity> findByStudentId(Long studentId);
}