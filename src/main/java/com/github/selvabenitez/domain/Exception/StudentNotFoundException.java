package com.github.selvabenitez.domain.Exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String id) {
        super("Student not found: " + id);
    }
}
