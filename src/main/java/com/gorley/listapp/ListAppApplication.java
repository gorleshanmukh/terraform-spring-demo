package com.gorley.listapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class ListAppApplication {

    @Autowired
    private ProductRepository repository;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product employee) {
        return repository.save(employee);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(ListAppApplication.class, args);
    }

}
