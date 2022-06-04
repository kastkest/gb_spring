package com.github.kastkest.gb_spring.hw2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CartService {
    private Cart cart;

    @PostConstruct
    public void init() {
        this.cart = new Cart();
    }


}
