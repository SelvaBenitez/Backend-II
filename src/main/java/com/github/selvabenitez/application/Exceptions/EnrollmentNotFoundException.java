package com.github.selvabenitez.application.Exceptions;

public class EnrollmentNotFoundException extends RuntimeException {
    public EnrollmentNotFoundException(Long id) {
        super("The enrollment with id " + id + " was not found");
    }
}
