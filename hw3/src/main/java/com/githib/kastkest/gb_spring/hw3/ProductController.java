package com.githib.kastkest.gb_spring.hw3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProductController {
    private ProductRepository repository;


    @GetMapping("/products")
    public List<Product> showAllProducts() {
        return Collections.unmodifiableList(repository.getAllProducts());
    }

    @PostMapping("/products")
    public void addProducts(Product product) {
        repository.addProducts(product);
    }


}
