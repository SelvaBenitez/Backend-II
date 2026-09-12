/*
package com.github.selvabenitez.domain.repository.impl;
import com.github.selvabenitez.domain.models.CourseModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class CourseRepositoryService {
    private final List<CourseModel> database = new ArrayList<>();
    private Long sequenceId = 1L;

    @Override
    public List<CourseModel> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public CourseModel save(CourseModel course) {
        if (course.getId() == null) {
            course.setId(sequenceId++);
            database.add(course);
        } else {
            deleteById(course.getId());
            database.add(course);
        }
        return course;
    }

    @Override
    public Optional<CourseModel> findById(Long id) {
        return database.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    @Override
    public Optional<CourseModel> findByCode(String code) {
        return database.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst();
    }

    @Override
    public boolean deleteById(Long id) {
        return database.removeIf(c -> c.getId().equals(id));
    }
}

*/