package com.basket_store.basket_for_one.model;


import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Basket {

    private Set<Integer> products = new HashSet<>();

    public Set<Integer> getProducts() {
        return products;
    }

    public void addProduct(Integer id) {
        products.add(id);

    }

    @Override
    public String toString() {
        return "Basket{" +
                "productID=" + products +
                '}';
    }
}
