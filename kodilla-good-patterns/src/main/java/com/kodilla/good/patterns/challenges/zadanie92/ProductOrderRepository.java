package com.kodilla.good.patterns.challenges.zadanie92;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    public boolean createOrder(User user, Order order, LocalDateTime date) {

        System.out.println("Zapisano w bazie danych:" + '\n' + user.toString() + '\n' + order.toString() + '\n' + "Data: " + date.toString());

        return true;
    }
}
