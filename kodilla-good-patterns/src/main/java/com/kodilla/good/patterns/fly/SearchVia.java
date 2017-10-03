package com.kodilla.good.patterns.fly;

public class SearchVia implements Search {

    public void search(String town) {

        System.out.println("Loty przez - " + town);

        FlyList.getList().stream()
                .filter(s -> s.check(town))
                .forEach(System.out::println);
    }
}
