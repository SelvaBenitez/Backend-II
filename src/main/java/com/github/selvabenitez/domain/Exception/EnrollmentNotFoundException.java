package com.github.selvabenitez.domain.Exception;

public class EnrollmentNotFoundException extends RuntimeException {
    public EnrollmentNotFoundException(String message) {
        super(message);
    }
    public EnrollmentNotFoundException(Long id) {
        super("The enrollment with id " + id + " was not found");
    }
}
