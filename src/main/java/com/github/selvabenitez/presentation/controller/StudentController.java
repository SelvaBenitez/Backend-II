package com.github.selvabenitez.presentation.controller;

import com.github.selvabenitez.Application.dto.CreateStudentDto;
import com.github.selvabenitez.Application.dto.PatchStudentDto;
import com.github.selvabenitez.Application.dto.StudentResponseDto;
import com.github.selvabenitez.Application.dto.UpdateStudentDto;
import com.github.selvabenitez.Application.service.StudentService;
import com.github.selvabenitez.domain.models.StudentModel;
import com.github.selvabenitez.domain.Exception.StudentNotFoundException;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponseDto> getById(@PathVariable Long id) {
        StudentModel student = studentService.getById(id);
        return ResponseEntity.ok(StudentResponseDto.from(student));
    }

    @PostMapping
    public ResponseEntity<StudentResponseDto> create(@Valid @RequestBody CreateStudentDto dto) {
        StudentModel model = new StudentModel();
        model.setFirstName(dto.firstName());
        model.setLastName(dto.lastName());
        model.setEmail(dto.email());
        model.setBirthDate(dto.birthDate());

        var created = studentService.save(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(StudentResponseDto.from(created));
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentResponseDto> update(
            @PathVariable Long id,
            @Valid @RequestBody UpdateStudentDto dto) {

        StudentModel model = studentService.getById(id);
        model.setFirstName(dto.firstName());
        model.setLastName(dto.lastName());
        model.setEmail(dto.email());
        model.setBirthDate(dto.birthDate());

        var updated = studentService.save(model);
        return ResponseEntity.ok(StudentResponseDto.from(updated));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentResponseDto> patch(
            @PathVariable Long id,
            @Valid @RequestBody PatchStudentDto dto) {

        StudentModel student = studentService.getById(id);

        if (dto.firstName() != null) {
            student.setFirstName(dto.firstName());
        }
        if (dto.lastName() != null) {
            student.setLastName(dto.lastName());
        }
        if (dto.email() != null) {
            student.setEmail(dto.email());
        }
        if (dto.birthDate() != null) {
            student.setBirthDate(dto.birthDate());
        }

        var updated = studentService.save(student);
        return ResponseEntity.ok(StudentResponseDto.from(updated));
    }
}