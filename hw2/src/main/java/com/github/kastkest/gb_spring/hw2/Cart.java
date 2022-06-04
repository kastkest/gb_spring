package com.github.kastkest.gb_spring.hw2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<String> productList;

    public Cart() {
        this.productList = new ArrayList<>();
    }

    public void add(String productTitle){
        this.productList.add(productTitle);
    }

    public void remove(Product productTitle) {
        this.productList.removeIf(s -> s.equals(productTitle));
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productList=" + productList +
                '}';
    }
}