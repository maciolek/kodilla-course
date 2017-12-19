package com.kodilla.stream;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigInteger;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {

        Country japonia = new Country("Japonia", new BigInteger("127000000"), "Asia");
        Country chiny = new Country("Chiny", new BigInteger("1397000000"), "Asia");
        Country francja = new Country("Francja", new BigInteger("66700000"), "Europe");
        Country polska = new Country("Polska", new BigInteger("37950000"), "Europe");
        Country kamerun = new Country("Kamerun", new BigInteger("24000000"), "Africa");
        Country egipt = new Country("Egipt", new BigInteger("96000000"), "Africa");

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
        world.addWorld(asia);
        world.addWorld(europe);
        world.addWorld(africa);

        BigInteger totalPeopleQuantityAsia = asia.getNameOfTheContinent().stream()
                .map(people -> people.getPeopleQuantity())
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
        System.out.println("Populacja Azji: " + totalPeopleQuantityAsia);

        BigInteger totalPeopleQuantityEurope = europe.getNameOfTheContinent().stream()
                .map(people -> people.getPeopleQuantity())
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
        System.out.println("Populacja Europy: " + totalPeopleQuantityEurope);

        BigInteger totalPeopleQuantityAfrica = africa.getNameOfTheContinent().stream()
                .map(people -> people.getPeopleQuantity())
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
        System.out.println("Populacja Afryki: " + totalPeopleQuantityAfrica);

        List<Continent> theWorld = world.getWorld();

        BigInteger totalWorldPopulation = theWorld.stream()
                .flatMap(c -> c.getCountry().stream())
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
