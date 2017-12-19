package com.kodilla.stream.world;

import com.kodilla.stream.invoice.simple.SimpleProduct;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Continent {

    private final Country country;
    private final String continent;

    public Continent(final Country country, final String continent) {
        this.country = country;
        this.continent=continent;

    }

    private final Set<Country> listContinents = new HashSet<>();

    public void AddCounrty(Country country) {
        listContinents.add(country);
    }

    public BigDecimal getPeopleQuantityOfCountry() {
        return country.getPeopleQuantityOfCountry();
    }

    public Set<Country> getContinentsList() {
        return listContinents;
    }

    public Country getCountry() {
        return country;
    }

}






