package com.github.selvabenitez.domain.repository;

import com.github.selvabenitez.domain.models.CourseModel;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {
    List<CourseModel> finAll();
    Optional<CourseModel> findById(long id);
}
