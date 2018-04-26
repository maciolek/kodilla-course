package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class XxlSizePizzaDecorator extends AbstractPizzaDecorator {

    public XxlSizePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10.00));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "size: XXL\n";
    }
}
