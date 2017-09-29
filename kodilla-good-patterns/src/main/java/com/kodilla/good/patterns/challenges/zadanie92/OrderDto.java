package com.kodilla.good.patterns.challenges.zadanie92;

public class OrderDto {

    public User user;
    public Order order;
    public boolean isOrder;

    public OrderDto(final User user,final Order order,final boolean isOrder) {
        this.user = user;
        this.order = order;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
