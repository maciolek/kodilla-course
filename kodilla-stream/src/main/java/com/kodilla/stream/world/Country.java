package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class Country {

    private final String nameCountry;
    private final BigDecimal peopleQuantityOfCountry;
    private final String nameOfContinent;

    public Country(final String nameCountry, final BigDecimal peopleQuantityOfCountry, final String nameOfContinent) {
        this.nameCountry = nameCountry;
        this.peopleQuantityOfCountry = peopleQuantityOfCountry;
        this.nameOfContinent = nameOfContinent;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantityOfCountry;
    }
}


