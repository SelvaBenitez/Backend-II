package com.github.selvabenitez.Application.service.impl;

import com.github.selvabenitez.Application.dto.CreateEnrollmentDto;
import com.github.selvabenitez.Application.dto.EnrollmentResponseDto;
import com.github.selvabenitez.Application.service.EnrollmentService;
import com.github.selvabenitez.domain.models.EnrollmentModel;
import com.github.selvabenitez.domain.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public EnrollmentResponseDto createEnrollment(CreateEnrollmentDto dto) {
        EnrollmentModel modelInput = new EnrollmentModel(
                null,
                dto.getStudentId(),
                dto.getCourseId(),
                dto.getEnrollmentDate(),
                dto.getStatus()
        );

        EnrollmentModel savedModel = enrollmentRepository.save(modelInput);

        return mapToDto(savedModel);
    }

    @Override
    public List<EnrollmentResponseDto> getAllEnrollments() {
        return enrollmentRepository.findAll().stream()
                .map(this::mapToDto)
                .toList();
    }

    @Override
    public EnrollmentResponseDto getEnrollmentById(Long id) {
        EnrollmentModel model = enrollmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inscripción no encontrada con ID: " + id));
        return mapToDto(model);
    }

    private EnrollmentResponseDto mapToDto(EnrollmentModel model) {
        return new EnrollmentResponseDto(
                model.getId(),
                model.getStudentId(),
                model.getCourseId(),
                model.getEnrollmentDate(),
                model.getStatus()
        );
    }
}