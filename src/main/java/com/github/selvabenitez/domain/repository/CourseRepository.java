package com.github.selvabenitez.domain.repository;

import com.github.selvabenitez.domain.models.CourseModel;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {
    List<CourseModel> findAll();
    CourseModel save(CourseModel course);
    Optional<CourseModel> findById(Long id);
    Optional<CourseModel> findByCode(String code);
    boolean deleteById(Long id);
}
