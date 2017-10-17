package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigMac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sezamowa")
                .ingredient("cebula")
                .burgers(3)
                .ingredient("ser")
                .sauce("ketchup")
                .ingredient("bekon")
                .ingredient("ogórek")
                .build();
        System.out.println(bigmac);
        //When
        int ingredient = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4,ingredient);
    }
}
