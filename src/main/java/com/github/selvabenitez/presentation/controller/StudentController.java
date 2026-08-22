package com.github.selvabenitez.presentation.controller;

import com.github.selvabenitez.domain.models.StudentModel;
import com.github.selvabenitez.Application.service.StudentService; // Importa la interfaz
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService; // Usa la Interfaz, no la Impl

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentModel> list() {
        return this.studentService.findAll(); // Llama a la instancia
    }

    //@PostMapping

}