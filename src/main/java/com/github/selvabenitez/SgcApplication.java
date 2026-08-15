package com.github.selvabenitez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.company.coursemanagement") // Cambia a la ruta exacta donde están tus interfaces de Repositorio
public class SgcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SgcApplication.class, args);
    }

}