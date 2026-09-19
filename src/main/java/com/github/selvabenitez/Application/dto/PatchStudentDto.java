package com.github.selvabenitez.Application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import java.time.LocalDate;

public record PatchStudentDto(
        String firstName,
        String lastName,
        @Email(message = "email inválido")
        String email,
        @Past(message = "birthDate debe ser una fecha pasada")
        LocalDate birthDate
) {}