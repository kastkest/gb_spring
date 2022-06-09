package com.githib.kastkest.gb_spring.hw3;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/v1/products")
    public List<Product> showAllProducts() {
        return repository.getAllProducts();
    }

    @GetMapping("/api/v1/products/{id}")
    public Optional<Product> showProductById(@PathVariable Long id) {
        return repository.showProductById(id);
    }

    @PostMapping("/api/v1/products")
    public void addProducts(@RequestBody Product product) {
        repository.addProducts(product);
    }

    @DeleteMapping("/api/v1/products")
    public void deleteAllProducts() {
        repository.removeAllProduct();
    }

    @DeleteMapping("/api/v1/products/{id}")
    public void deleteProductById(@PathVariable Long id) {
        repository.removeById(id);
    }
}
