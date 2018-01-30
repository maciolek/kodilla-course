package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuits {

    @Test
    public void testBicMacBuilder() {

        //given
        Bigmac bigmac = new Bigmac.BuilderBigMac()
                .roll(Bigmac.BuilderBigMac.ROLL_WITH_SESAME)
                .burgers(2)
                .ingredients(Bigmac.BuilderBigMac.ONION)
                .sauce(Bigmac.BuilderBigMac.ONE_THOUSAND_ISLANDS_DRESSING)
                .ingredients(Bigmac.BuilderBigMac.CUCUMBER)
                .build();

        //when
        String chosenRool = bigmac.getRoll();
        int numbersOfBurgers = bigmac.getBurgers();
        String chosenSauce = bigmac.getSauce();
        String chosenIngredient1 = Bigmac.BuilderBigMac.ONION;
        String chosenIngredient2 = Bigmac.BuilderBigMac.CUCUMBER;
        String notChosenIngredient = Bigmac.BuilderBigMac.CHEESE;

        //then
        Assert.assertEquals(Bigmac.BuilderBigMac.ROLL_WITH_SESAME, chosenRool);
        Assert.assertEquals(2, numbersOfBurgers);
        Assert.assertEquals(Bigmac.BuilderBigMac.ONE_THOUSAND_ISLANDS_DRESSING, chosenSauce);
        Assert.assertTrue(bigmac.getIngredients().contains(chosenIngredient1));
        Assert.assertTrue(bigmac.getIngredients().contains(chosenIngredient2));
        Assert.assertFalse(bigmac.getIngredients().contains(notChosenIngredient));
    }
}

