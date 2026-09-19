package com.github.selvabenitez.infrastructura.persistence.jpa.adapter;

import com.github.selvabenitez.domain.models.CourseModel;
import com.github.selvabenitez.domain.repository.CourseRepository;
import com.github.selvabenitez.infrastructura.persistence.jpa.entity.CourseEntity;
import com.github.selvabenitez.infrastructura.persistence.jpa.repository.CourseJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CourseRepositoryAdapter implements CourseRepository {

    private final CourseJpaRepository jpaRepository;

    public CourseRepositoryAdapter(CourseJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<CourseModel> findAll() {
        return jpaRepository.findAll().stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public CourseModel save(CourseModel course) {
        CourseEntity entity = toEntity(course);
        CourseEntity savedEntity = jpaRepository.save(entity);
        return toModel(savedEntity);
    }

    @Override
    public Optional<CourseModel> findById(Long id) {
        return jpaRepository.findById(id).map(this::toModel);
    }

    @Override
    public Optional<CourseModel> findByCode(String code) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaRepository.existsById(id)) {
            jpaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private CourseModel toModel(CourseEntity entity) {
        return new CourseModel(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getCapacity()
        );
    }

    private CourseEntity toEntity(CourseModel model) {
        return new CourseEntity(
                model.getId(),
                model.getName(),
                model.getDescription(),
                model.getCapacity()
        );
    }
}