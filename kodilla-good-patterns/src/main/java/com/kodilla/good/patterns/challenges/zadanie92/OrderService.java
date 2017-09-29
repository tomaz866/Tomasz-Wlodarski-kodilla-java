package com.kodilla.good.patterns.challenges.zadanie92;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order (User user, Order order, LocalDateTime date);
}
