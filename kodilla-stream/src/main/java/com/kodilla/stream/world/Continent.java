package com.kodilla.stream.world;

import com.kodilla.stream.invoice.simple.SimpleProduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Continent {

    private Country country;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String continent) {
        if (continent != "Europe" && continent != "Asia" && continent != "Africa")
            throw new IllegalArgumentException("bad argument");
    }

    public List<Country> getCountries() {
        return Collections.unmodifiableList(countries);
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public BigDecimal getPeopleQuantity() {
        return country.getPeopleQuantity();
    }
}








