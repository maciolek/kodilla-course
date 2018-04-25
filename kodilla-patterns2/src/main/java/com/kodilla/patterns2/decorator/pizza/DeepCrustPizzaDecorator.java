package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DeepCrustPizzaDecorator extends AbstractPizzaDecorator {

    public DeepCrustPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.00));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "deep-crust\n";
    }
}


