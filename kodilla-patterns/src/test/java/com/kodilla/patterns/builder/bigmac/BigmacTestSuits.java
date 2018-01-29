package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

public class BigmacTestSuits {

    @Test

    public void Test1() {

        Bigmac bigmac = new Bigmac.BuilderBigMac()
                .roll("ROLLWITHSESAME")
                .burgers(2)
                .sauce("standardSauce")
                .ingredients("onion")
                .ingredients("cucumber")
                .build();



    }
}
