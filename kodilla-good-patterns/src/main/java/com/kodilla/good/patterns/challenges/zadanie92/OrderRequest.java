package com.kodilla.good.patterns.challenges.zadanie92;

import java.time.LocalDateTime;

public class OrderRequest {

    public User user;
    public Order order;
    public LocalDateTime date;

    public OrderRequest(User user, Order order, LocalDateTime date) {
        this.user = user;
        this.order = order;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
