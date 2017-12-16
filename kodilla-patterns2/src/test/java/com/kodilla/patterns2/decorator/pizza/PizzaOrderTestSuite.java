package com.kodilla.patterns2.decorator.pizza;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal orderCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15.00),orderCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Basic pizza (tomato sauce, cheese)", description);
    }

    @Test
    public void testPizzaWithTwoAdditionGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        BigDecimal orderCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(29.00),orderCost);
    }

    @Test
    public void testPizzaWithTwoAdditionGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Basic pizza (tomato sauce, cheese) + bacon + mushrooms", description);
    }

    @Test
    public void testPizzaWithThreeAdditionGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PineappleDecorator(theOrder);
        //When
        BigDecimal orderCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(36.00),orderCost);
    }

    @Test
    public void testPizzaWithThreeAdditionGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PineappleDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Basic pizza (tomato sauce, cheese) + bacon + mushrooms + pineapple", description);
    }

    @Test
    public void testPizzaWithFourAdditionGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PineappleDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        BigDecimal orderCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(41.00),orderCost);
    }

    @Test
    public void testPizzaWithFourAdditionGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PineappleDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Basic pizza (tomato sauce, cheese) + bacon + mushrooms + pineapple + cheese", description);
    }
}
