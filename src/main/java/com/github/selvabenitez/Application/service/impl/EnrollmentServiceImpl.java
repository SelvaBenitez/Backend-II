package com.github.selvabenitez.Application.service.impl;

import com.github.selvabenitez.domain.repository.EnrollmentRepository;

public class EnrollmentServiceImpl {
    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }
}
