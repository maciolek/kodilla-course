package com.kodilla.stream;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {

        Country japonia = new Country("Japonia", new BigDecimal("127000000"), "Asia");
        Country chiny = new Country("Chiny", new BigDecimal("1397000000"), "Asia");
        Country francja = new Country("Francja", new BigDecimal("66700000"), "Europe");
        Country polska = new Country("Polska", new BigDecimal("37950000"), "Europe");
        Country kamerun = new Country("Kamerun", new BigDecimal("24000000"), "Africa");
        Country egipt = new Country("Egipt", new BigDecimal("96000000"), "Africa");

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");

        asia.addCountry(japonia);
        asia.addCountry(chiny);
        europe.addCountry(francja);
        europe.addCountry(polska);
        africa.addCountry(kamerun);
        africa.addCountry(egipt);

        World world = new World();

        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);

//        BigDecimal totalPeopleQuantityAsia = asia.getCountries().stream()
//                .map(people -> people.getPeopleQuantity())
//                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
//        System.out.println("Populacja Azji: " + totalPeopleQuantityAsia);
//
//        BigDecimal totalPeopleQuantityEurope = europe.getCountries().stream()
//                .map(people -> people.getPeopleQuantity())
//                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
//        System.out.println("Populacja Europy: " + totalPeopleQuantityEurope);
//
//        BigDecimal totalPeopleQuantityAfrica = africa.getCountries().stream()
//                .map(people -> people.getPeopleQuantity())
//                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
//        System.out.println("Populacja Afryki: " + totalPeopleQuantityAfrica);

        //    List<Continent> theWorld = world.getContinents().stream();


 /*       BigDecimal totalWorldPopulation = world.getContinents().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        System.out.println("Populacja świata :" + totalWorldPopulation);
    }*/
        System.out.println("Populacja świata :" + world.getTotalWorldPopulation());

    }
}
