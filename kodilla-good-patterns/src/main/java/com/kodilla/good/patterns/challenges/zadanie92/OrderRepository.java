package com.kodilla.good.patterns.challenges.zadanie92;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder (User user, Order order, LocalDateTime date);
}
