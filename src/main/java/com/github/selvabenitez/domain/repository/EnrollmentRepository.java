package com.github.selvabenitez.domain.repository;

import com.github.selvabenitez.domain.models.EnrollmentModel;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository {
    List<EnrollmentModel> finAll();
    Optional<EnrollmentRepository> findById(long id);
}
