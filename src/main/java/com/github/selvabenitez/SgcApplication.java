package com.github.selvabenitez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.github.selvabenitez")
public class SgcApplication {
    public static void main(String[] args) {
        SpringApplication.run(SgcApplication.class, args);
    }
}