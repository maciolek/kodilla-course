package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class World {

    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return Collections.unmodifiableList(continents);
    }

    public BigDecimal getTotalWorldPopulation() {
        BigDecimal totalWorldPopulation = getContinents().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalWorldPopulation;
    }
}



