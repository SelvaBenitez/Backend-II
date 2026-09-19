package com.github.selvabenitez.Application.service;

import com.github.selvabenitez.Application.dto.CreateEnrollmentDto;
import com.github.selvabenitez.Application.dto.EnrollmentResponseDto;

import java.util.List;

public interface EnrollmentService {
    EnrollmentResponseDto createEnrollment(CreateEnrollmentDto dto);
    List<EnrollmentResponseDto> getAllEnrollments();
    EnrollmentResponseDto getEnrollmentById(Long id);
}