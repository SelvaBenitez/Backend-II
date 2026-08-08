package com.github.selvabenitez.Application.service.impl;

import com.github.selvabenitez.domain.repository.CourseRepository;

public class CourseServiceImpl {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
}
