
package com.example.orderservice.model;

import java.util.List;

public class OrderResponse {

    private Long orderId;
    private Long userId;
    private Long restaurantId;
    private List<String> items;
    private String status;

    public OrderResponse(Long orderId, Long userId,
            Long restaurantId, List<String> items, String status) {

        this.orderId = orderId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.items = items;
        this.status = status;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public List<String> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }
}
