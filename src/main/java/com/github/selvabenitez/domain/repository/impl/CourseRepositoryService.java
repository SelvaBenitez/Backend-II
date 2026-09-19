package com.github.selvabenitez.domain.repository.impl;

import com.github.selvabenitez.domain.models.CourseModel;
import com.github.selvabenitez.domain.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseRepositoryService implements CourseRepository {

    private final CourseRepository courseRepository;

    public CourseRepositoryService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseModel> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public CourseModel save(CourseModel course) {
        return courseRepository.save(course);
    }

    @Override
    public Optional<CourseModel> findById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Optional<CourseModel> findByCode(String code) {
        return courseRepository.findByCode(code);
    }

    @Override
    public boolean deleteById(Long id) {
        return courseRepository.deleteById(id);
    }
}