package com.github.selvabenitez.domain.Exception;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String message) {
        super(message);
    }
    public CourseNotFoundException(Long id) {
        super("Course not found: " + id);}
}
