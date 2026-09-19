package com.github.selvabenitez.domain.repository.impl;

import com.github.selvabenitez.domain.models.EnrollmentModel;
import com.github.selvabenitez.domain.models.EnrollmentStatus;
import com.github.selvabenitez.domain.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentRepositoryService implements EnrollmentRepository {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentRepositoryService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public EnrollmentModel save(EnrollmentModel enrollmentModel) {
        return enrollmentRepository.save(enrollmentModel);
    }

    @Override
    public List<EnrollmentModel> findAll() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Optional<EnrollmentModel> findById(Long id) {
        return enrollmentRepository.findById(id);
    }

    @Override
    public Boolean existByStudentIdAndCourseId(Long studentId, Long courseId) {
        return enrollmentRepository.existByStudentIdAndCourseId(studentId, courseId);
    }

    @Override
    public Long countByCourseIdAndStatus(Long courseId, EnrollmentStatus status) {
        return enrollmentRepository.countByCourseIdAndStatus(courseId, status);
    }

    @Override
    public List<EnrollmentModel> findByStudentId(Long studentId) {
        return enrollmentRepository.findByStudentId(studentId);
    }
}