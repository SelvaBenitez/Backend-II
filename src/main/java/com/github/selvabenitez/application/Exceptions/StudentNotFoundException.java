package com.github.selvabenitez.application.Exceptions;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("Student not found: " + id);
    }
}

