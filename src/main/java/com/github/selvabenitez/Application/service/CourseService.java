package com.github.selvabenitez.Application.service;

import com.github.selvabenitez.Application.dto.CreateCourseDto;
import com.github.selvabenitez.domain.models.CourseModel;

import java.util.List;

public interface CourseService {
    CourseModel createCourse(CreateCourseDto dto);
    List<CourseModel> getAllCourses();
    CourseModel getCourseById(Long id);
    boolean deleteCourse(Long id);
}