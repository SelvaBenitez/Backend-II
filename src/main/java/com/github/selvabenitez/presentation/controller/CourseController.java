package com.github.selvabenitez.presentation.controller;

import com.github.selvabenitez.Application.dto.CreateCourseDto;
import com.github.selvabenitez.Application.service.CourseService;
import com.github.selvabenitez.domain.models.CourseModel;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<CourseModel> createCourse(@Valid @RequestBody CreateCourseDto dto) {
        CourseModel course = courseService.createCourse(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(course);
    }

    @GetMapping
    public ResponseEntity<List<CourseModel>> getAllCourses() {
        return ResponseEntity.ok(courseService.getAllCourses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseModel> getCourseById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.getCourseById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}