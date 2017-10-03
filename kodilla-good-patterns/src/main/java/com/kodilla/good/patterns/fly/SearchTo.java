package com.kodilla.good.patterns.fly;

public class SearchTo implements Search {

    public void search(String town) {

        System.out.println("Loty do - " + town);

        FlyList.getList().stream()
                .filter(s -> s.check(town))
                .forEach(System.out::println);
    }
}
