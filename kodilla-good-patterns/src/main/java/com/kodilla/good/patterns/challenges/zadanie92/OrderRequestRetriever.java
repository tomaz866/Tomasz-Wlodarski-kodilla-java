package com.kodilla.good.patterns.challenges.zadanie92;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retriever() {

        User user = new User("Tom","Wlodarski",21,"tom21");

        Order order = new Order("Widelce",36);

        LocalDateTime orderDate = LocalDateTime.now();

        return new OrderRequest(user, order, orderDate);
    }
}
