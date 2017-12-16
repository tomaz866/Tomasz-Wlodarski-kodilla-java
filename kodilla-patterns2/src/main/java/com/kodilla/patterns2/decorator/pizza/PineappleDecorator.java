package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PineappleDecorator extends AbstractPizzaOrderDecorator{

    public PineappleDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + pineapple";
    }
}
