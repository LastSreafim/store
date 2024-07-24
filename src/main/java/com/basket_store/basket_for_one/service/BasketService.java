package com.basket_store.basket_for_one.service;


import com.basket_store.basket_for_one.model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Service
@SessionScope
public class BasketService {
    private final Basket basket = new Basket();


    public void add(Set<Integer> ids) {
        ids.forEach(basket::addProduct);
    }


    public Set<Integer> get() {
        return basket.getProducts();
    }
}
