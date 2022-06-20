package com.github.kastkest.gb_spring.hw2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Water", 10.0));
        products.add(new Product(2L, "Juice", 20.0));
        products.add(new Product(3L, "Bread", 50.0));
        products.add(new Product(4L, "Meat", 150.0));
        products.add(new Product(5L, "Fish", 200.0));
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }

    public Optional<Product> findById (Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @Override
    public String toString() {
        return "ProductRepository:\n{" +
                "products=" + products +
                '}';
    }
}
