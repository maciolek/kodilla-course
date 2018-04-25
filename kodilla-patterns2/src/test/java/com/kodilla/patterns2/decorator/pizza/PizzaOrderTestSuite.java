package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;


public class PizzaOrderTestSuite {

    private static String BASIC_INGREDIENTS = "Ingredients:\nstandard crust\ntomato sauce\n";
    private static String BASIC_INGREDIENTS_THIN_PEPPERONI_XXL =
            "Ingredients:\nstandard crust\ntomato sauce\nthin-crust\npepperoni\nsize: XXL\n";
    private static String BASIC_INGREDIENTS_DEEP_CHEESE =
            "Ingredients:\nstandard crust\ntomato sauce\ndeep-crust\nextra cheese\n";

    @Test
    public void testBasicPizzaGetCost() {
        //given
        PizzaOrder pizza = new BasicPizza();
        //when
        BigDecimal calculatedCost = pizza.getCost();
        //then
        Assert.assertEquals(new BigDecimal(15.00), calculatedCost);
    }

    @Test
    public void testBasicPizzaGetIngredients() {
        //given
        PizzaOrder pizza = new BasicPizza();
        //when
        String ingredients = pizza.getIngredients();
        //then
        System.out.println(ingredients);
        Assert.assertEquals(BASIC_INGREDIENTS, ingredients);
    }

    @Test
    public void testPizzaWithDeepCrustAndCheeseGetCost() {
        //given
        PizzaOrder pizza = new BasicPizza();
        pizza = new DeepCrustPizzaDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        //when
        BigDecimal calculatedCost = pizza.getCost();
        //then
        Assert.assertEquals(new BigDecimal(22.00), calculatedCost);
    }

    @Test
    public void testPizzaWithDeepCrustAndCheeseGetIngredients() {
        //given
        PizzaOrder pizza = new BasicPizza();
        pizza = new DeepCrustPizzaDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        //when
        String ingredients = pizza.getIngredients();
        //then
        Assert.assertEquals(BASIC_INGREDIENTS_DEEP_CHEESE, ingredients);
    }

    @Test
    public void testPizzaWithThinCrustAndPepperoniAndXxlSizeGetCost() {
        //given
        PizzaOrder pizza = new BasicPizza();
        pizza = new ThinCrustPizzaDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);
        pizza = new XxlSizePizzaDecorator(pizza);
        //when
        BigDecimal calculatedCost = pizza.getCost();
        //then
        Assert.assertEquals(new BigDecimal(32.00), calculatedCost);
    }

    @Test
    public void testPizzaWithThinCrustAndPepperoniAndXxlSizeGetIngredients() {
        //given
        PizzaOrder pizza = new BasicPizza();
        pizza = new ThinCrustPizzaDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);
        pizza = new XxlSizePizzaDecorator(pizza);
        //when
        String ingredients = pizza.getIngredients();
        //then
        Assert.assertEquals(BASIC_INGREDIENTS_THIN_PEPPERONI_XXL, ingredients);
    }

}

