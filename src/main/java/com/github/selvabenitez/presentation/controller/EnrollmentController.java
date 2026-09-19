package com.github.selvabenitez.presentation.controller;

import com.github.selvabenitez.Application.dto.CreateEnrollmentDto;
import com.github.selvabenitez.Application.dto.EnrollmentResponseDto;
import com.github.selvabenitez.Application.service.EnrollmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping
    public ResponseEntity<EnrollmentResponseDto> createEnrollment(@Valid @RequestBody CreateEnrollmentDto dto) {
        EnrollmentResponseDto response = enrollmentService.createEnrollment(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<EnrollmentResponseDto>> getAllEnrollments() {
        return ResponseEntity.ok(enrollmentService.getAllEnrollments());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnrollmentResponseDto> getEnrollmentById(@PathVariable Long id) {
        return ResponseEntity.ok(enrollmentService.getEnrollmentById(id));
    }
}