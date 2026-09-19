package com.github.selvabenitez.Application.service.impl;

import com.github.selvabenitez.Application.dto.CreateCourseDto;
import com.github.selvabenitez.Application.service.CourseService;
import com.github.selvabenitez.domain.Exception.CourseNotFoundException;
import com.github.selvabenitez.domain.models.CourseModel;
import com.github.selvabenitez.domain.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseModel createCourse(CreateCourseDto dto) {
        CourseModel model = new CourseModel(
                null,
                dto.getName(),
                dto.getDescription(),
                dto.getCapacity()
        );
        return courseRepository.save(model);
    }

    @Override
    public List<CourseModel> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public CourseModel getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException(id));
    }

    @Override
    public boolean deleteCourse(Long id) {
        if (courseRepository.findById(id).isEmpty()) {
            throw new CourseNotFoundException(id);
        }
        return courseRepository.deleteById(id);
    }
}