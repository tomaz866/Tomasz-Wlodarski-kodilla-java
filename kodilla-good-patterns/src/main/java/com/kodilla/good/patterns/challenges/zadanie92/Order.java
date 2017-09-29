package com.kodilla.good.patterns.challenges.zadanie92;

public class Order {
    private String name;
    private int quantity;

    public Order(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Zamówienie: " + '\n' +
                "Nazwa - " + name + '\n' +
                "Ilość - " + quantity;
    }
}
