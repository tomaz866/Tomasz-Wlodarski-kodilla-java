package com.kodilla.good.patterns.food2door;

public class CheckOrder {

    public void check(boolean check) {
        if(check) {

            System.out.println("Sprawdzam..." + '\n' + "Zamówienie zostało zrealizowane.");
        } else {
            System.out.println("Sprawdzam..." + '\n' + "Zamówienie nie zostało zrealizowane.");
        }
    }
}
