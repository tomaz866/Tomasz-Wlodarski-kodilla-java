package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> allContinent = new HashSet<>();

    public boolean addContinent(Continent continent){
        return allContinent.add(continent);
    }

    BigDecimal totalPeople = new BigDecimal("0");

    public BigDecimal getAllPeopleQuantity(){
        totalPeople = allContinent.stream()
                     .flatMap(continent->continent.getCountries().stream())
                    .map(Country::getPeopleQuantity)
                    .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
             return totalPeople;


    }
}
