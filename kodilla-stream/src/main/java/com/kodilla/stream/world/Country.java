package com.kodilla.stream.world;
import java.math.BigInteger;

public final class Country {

    private final String nameCountry;
    private final BigInteger peopleQuantityOfCountry;
    private final String nameOfcontinent;

    public Country(final String nameCountry, final BigInteger peopleQuantityOfCountry, final String nameOfcontinent) {
        this.nameCountry = nameCountry;
        this.peopleQuantityOfCountry = peopleQuantityOfCountry;
        this.nameOfcontinent=nameOfcontinent;
     }

    public String getNameCountry() {
        return nameCountry;
    }

    public String getNameOfcontinent() {
        return nameOfcontinent;
    }

    public BigInteger getPeopleQuantity() {
        return peopleQuantityOfCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", peopleQuantityOfCountry=" + peopleQuantityOfCountry +
                ", nameOfcontinent='" + nameOfcontinent + '\'' +
 //               ", listCountry=" + listCountry +
                '}';
    }
}
