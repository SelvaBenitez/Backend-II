package com.github.selvabenitez.Application.dto;

import com.github.selvabenitez.domain.models.EnrollmentStatus;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class CreateEnrollmentDto {

    @NotNull(message = "El ID del estudiante es obligatorio")
    private Long studentId;

    @NotNull(message = "El ID del curso es obligatorio")
    private Long courseId;

    @NotNull(message = "La fecha de inscripción es obligatoria")
    private LocalDate enrollmentDate;

    @NotNull(message = "El estado es obligatorio")
    private EnrollmentStatus status;

    public CreateEnrollmentDto() {}

    public CreateEnrollmentDto(Long studentId, Long courseId, LocalDate enrollmentDate, EnrollmentStatus status) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }

    public LocalDate getEnrollmentDate() { return enrollmentDate; }
    public void setEnrollmentDate(LocalDate enrollmentDate) { this.enrollmentDate = enrollmentDate; }

    public EnrollmentStatus getStatus() { return status; }
    public void setStatus(EnrollmentStatus status) { this.status = status; }
}