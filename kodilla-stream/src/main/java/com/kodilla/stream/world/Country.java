package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public final class Country {

    private final String nameCountry;
    private final String continent;
    public final BigDecimal peopleQuantityOfCountry;

    public Country(final String continent, final String nameCountry, final BigDecimal peopleQuantityOfCountry) {
        if (continent != "Europe" && continent != "Asia" && continent != "Africa") throw new IllegalArgumentException("bad argument");
        this.nameCountry = nameCountry;
        this.continent = continent;
        this.peopleQuantityOfCountry = peopleQuantityOfCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }
 /*   public String getContinent() {
        return continent;
    }*/

    public BigDecimal getPeopleQuantityOfCountry() {
        return peopleQuantityOfCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(nameCountry, country.nameCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCountry);
    }
}
