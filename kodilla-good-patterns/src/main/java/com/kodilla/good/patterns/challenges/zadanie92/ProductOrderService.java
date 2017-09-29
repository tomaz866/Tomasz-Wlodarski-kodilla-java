package com.kodilla.good.patterns.challenges.zadanie92;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, final Order order, final LocalDateTime date) {

        System.out.println("Kupujący - " + user.getNick() + '\n' + order.toString() + '\n' + "Data: " + date.toString());

        return true;
    }
}
