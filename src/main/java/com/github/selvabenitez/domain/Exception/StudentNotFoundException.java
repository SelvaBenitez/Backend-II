package com.github.selvabenitez.domain.Exception;

public class StudentNotFoundException extends ResourceNotFoundException {

    public StudentNotFoundException(Long id) {
        super("Estudiante no encontrado con id: " + id);
    }

    public StudentNotFoundException(String message) {
        super(message);
    }
}