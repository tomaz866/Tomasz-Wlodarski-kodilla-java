package com.kodilla.good.patterns.fly;

public class Application {

    public static void main(String[] args) {

        new SearchFrom().search("Gdańsk");

        new SearchTo().search("Kraków");

        new SearchVia().search("Toruń");
    }
}
