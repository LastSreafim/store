package com.basket_store.basket_for_one.controller;


import com.basket_store.basket_for_one.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Set;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public void addProducts(@RequestParam Set<Integer> product) {
        basketService.add(product);
    }

    @GetMapping(path = "/get")
    public Set<Integer> getProducts() {
        return basketService.get();
    }
}
