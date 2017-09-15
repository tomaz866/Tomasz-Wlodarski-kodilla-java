package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country country1 = new Country("Polska",new BigDecimal("3000"));
        Country country2 = new Country("Anglia",new BigDecimal("4000"));
        Country country3 = new Country("Egipt",new BigDecimal("1000"));
        Country country4 = new Country("Chiny",new BigDecimal("40000"));
        Country country5 = new Country("USA",new BigDecimal("6000"));
        Country country6 = new Country("Brazylia",new BigDecimal("3000"));

        Continent continent1 = new Continent("Europa");
        Continent continent2 = new Continent("Azja");
        Continent continent3 = new Continent("Afryka");
        Continent continent4 = new Continent("Ameryka Północna");
        Continent continent5 = new Continent("Ameryka Południowa");

        World world = new World();

        //When

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent2.addCountry(country4);
        continent3.addCountry(country3);
        continent4.addCountry(country5);
        continent5.addCountry(country6);

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);

        BigDecimal allPeople = world.getAllPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("57000");
        Assert.assertEquals(expected,allPeople);
;



    }
}
