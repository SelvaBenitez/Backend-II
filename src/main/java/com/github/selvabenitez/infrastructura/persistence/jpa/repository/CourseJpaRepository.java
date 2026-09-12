package com.github.selvabenitez.infrastructura.persistence.jpa.repository;

import com.github.selvabenitez.infrastructura.persistence.jpa.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseJpaRepository extends JpaRepository<CourseEntity, Long> {
}