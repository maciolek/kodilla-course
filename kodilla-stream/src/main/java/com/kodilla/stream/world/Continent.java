package com.kodilla.stream.world;

import com.kodilla.stream.invoice.simple.SimpleProduct;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Continent {

    private Country country;
    private final List<Country> nameOfContinent = new ArrayList<>();

    public Continent(final String nameOfContinent) {
            if (nameOfContinent != "Europe" && nameOfContinent != "Asia" && nameOfContinent != "Africa") throw new IllegalArgumentException("bad argument");
 //           this.country = country;
                   }

    public List<Country> getNameOfTheContinent() {
   //     nameOfContinent.add(country);
        return new ArrayList<>(nameOfContinent);
    }

 /*   public List<Country> getListOfContinent() {
        return new nameOfContinent(country);
    }*/

    public void addCountry(Country country) {
            nameOfContinent.add(country);
    }
 /*   public List<Country> addCountry(Country country){
           nameOfContinent.add(country);
           */

    public Country getCountry() {
        return country;
    }

    public BigInteger getPeopleQuantity() {
            return country.getPeopleQuantity();
        }


    }








