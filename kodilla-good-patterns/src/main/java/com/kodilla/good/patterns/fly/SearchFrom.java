package com.kodilla.good.patterns.fly;

public class SearchFrom implements Search {

    public void search(String town) {

        System.out.println("Loty z - " + town);

        FlyList.getList().stream()
                .filter(s -> s.check(town))
                .forEach(System.out::println);
    }
}

