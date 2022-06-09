package com.githib.kastkest.gb_spring.hw3;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>(List.of(
                new Product(1L, "Milk"),
                new Product(2L, "Cola")
        ));
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product showProductById(Long id) {
        return products.get(id)
    }

    public void addProducts(Product product) {
        products.add(product);
    }

    public void removeAllProduct() {
        products.removeAll(products);
    }

    public void removeById(Long id) {
        products.removeIf(l -> l.getId().equals(id));
    }


}
