package com.chaseclinecoding.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ProductRepository repository;

    @Autowired
    public DatabaseLoader(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Product("Coffee mug", "a white ceramic coffee cup", BigDecimal.valueOf(1.99)));
    }
}