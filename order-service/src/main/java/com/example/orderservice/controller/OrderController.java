
package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.model.OrderRequest;
import com.example.orderservice.model.OrderResponse;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping
    public OrderResponse placeOrder(@RequestBody OrderRequest request) {

        return new OrderResponse(
            1001L,
            request.getUserId(),
            request.getRestaurantId(),
            request.getItems(),
            "ORDER_PLACED"
        );
    }
}
