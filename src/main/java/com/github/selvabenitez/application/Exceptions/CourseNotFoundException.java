package com.github.selvabenitez.application.Exceptions;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String message) {super(message); }

    public CourseNotFoundException(Long id) {
        super("Course not found: " + id);
    }
}
