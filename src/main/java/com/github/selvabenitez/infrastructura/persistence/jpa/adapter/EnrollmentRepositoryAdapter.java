package com.github.selvabenitez.infrastructura.persistence.jpa.adapter;

import com.github.selvabenitez.domain.models.EnrollmentModel;
import com.github.selvabenitez.domain.models.EnrollmentStatus;
import com.github.selvabenitez.domain.repository.EnrollmentRepository;
import com.github.selvabenitez.infrastructura.persistence.jpa.entity.CourseEntity;
import com.github.selvabenitez.infrastructura.persistence.jpa.entity.EnrollmentEntity;
import com.github.selvabenitez.infrastructura.persistence.jpa.entity.StudentEntity;
import com.github.selvabenitez.infrastructura.persistence.jpa.repository.EnrollmentJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class EnrollmentRepositoryAdapter implements EnrollmentRepository {

    private final EnrollmentJpaRepository jpaRepository;

    public EnrollmentRepositoryAdapter(EnrollmentJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<EnrollmentModel> findAll() {
        return jpaRepository.findAll().stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public EnrollmentModel save(EnrollmentModel enrollment) {
        EnrollmentEntity entity = toEntity(enrollment);
        EnrollmentEntity savedEntity = jpaRepository.save(entity);
        return toModel(savedEntity);
    }

    @Override
    public Optional<EnrollmentModel> findById(Long id) {
        return jpaRepository.findById(id).map(this::toModel);
    }

    @Override
    public Boolean existByStudentIdAndCourseId(Long studentId, Long courseId) {
        return jpaRepository.existsByStudentIdAndCourseId(studentId, courseId);
    }

    @Override
    public Long countByCourseIdAndStatus(Long courseId, EnrollmentStatus status) {
        return jpaRepository.countByCourseIdAndStatus(courseId, status);
    }

    @Override
    public List<EnrollmentModel> findByStudentId(Long studentId) {
        return jpaRepository.findByStudentId(studentId).stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    private EnrollmentModel toModel(EnrollmentEntity entity) {
        return new EnrollmentModel(
                entity.getId(),
                entity.getStudent().getId(),
                entity.getCourse().getId(),
                entity.getEnrolledAt(),
                entity.getStatus()
        );
    }

    private EnrollmentEntity toEntity(EnrollmentModel model) {
        StudentEntity student = new StudentEntity();
        student.setId(model.getStudentId());

        CourseEntity course = new CourseEntity();
        course.setId(model.getCourseId());

        return new EnrollmentEntity(
                model.getId(),
                student,
                course,
                model.getStatus(),
                model.getEnrollmentDate()

        );
    }
}