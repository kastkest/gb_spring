package com.github.kastkest.gb_spring.hw2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {

    private ProductRepository repository;
    private List<Product> products;

    @Autowired
    public Cart(ProductRepository repository) {
        this.repository = repository;
    }


    @PostConstruct
    public void init() {
        this.products = new ArrayList<>();
    }

    public void addToCardByProductId(Long productID) {
        Product product = repository.findById(productID).get();
        products.add(product);
    }

    public void removeByID(Long productId) {
        this.products.removeIf(s -> s.getId().equals(productId));
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}