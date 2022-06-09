package com.githib.kastkest.gb_spring.hw3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private ProductRepository repository;


    @GetMapping("/products")
    public void showAllProducts() {

    }
}
