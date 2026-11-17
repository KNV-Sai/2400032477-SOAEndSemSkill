
package com.example.restaurantservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurantservice.model.Restaurant;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @GetMapping
    public List<Restaurant> getRestaurants() {

        return List.of(
            new Restaurant(1L, "Spice Hub", "Vijayawada"),
            new Restaurant(2L, "Green Bowl", "Vijayawada"),
            new Restaurant(3L, "Pizza Corner", "Guntur")
        );
    }
}
