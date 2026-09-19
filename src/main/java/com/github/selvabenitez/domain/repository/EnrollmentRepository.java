package com.github.selvabenitez.domain.repository;

import com.github.selvabenitez.domain.models.EnrollmentModel;
import com.github.selvabenitez.domain.models.EnrollmentStatus;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository {
    EnrollmentModel save(EnrollmentModel enrollmentModel);
    List<EnrollmentModel> findAll();
    Optional<EnrollmentModel> findById(Long id);
    Boolean existByStudentIdAndCourseId(Long studentId, Long courseId);
    Long countByCourseIdAndStatus(Long courseId, EnrollmentStatus status);
    List<EnrollmentModel> findByStudentId(Long studentId);
}