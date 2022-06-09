package com.githib.kastkest.gb_spring.hw3;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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

    public Optional<Product> showProductById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void addProducts(Product product) {
        Long maxID = 0L;
        for (Product items: products) {
            if (items.getId() > maxID) {
                maxID = items.getId();
            }
        }
        products.add(product);
        Product lastAddedProduct = products.get(products.size() - 1);
        lastAddedProduct.setId(maxID);
    }


    public void removeAllProduct() {
        products.removeAll(products);
    }

    public void removeById(Long id) {
        products.removeIf(l -> l.getId().equals(id));
    }


}
