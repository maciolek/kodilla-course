package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantityOfWorld() {
        //given
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

        //when
        BigDecimal actualWorldQuantityPopulation = world.getTotalWorldPopulation();

        //then
        BigDecimal expectedWoldQuantityPopulation = new BigDecimal(1748650000);
        Assert.assertEquals(expectedWoldQuantityPopulation, actualWorldQuantityPopulation);
    }

    @Test
    public void testGetPeopleQuantityWhenNullOfCountries() {
        //given
        World world = new World();

        //when
        BigDecimal actualWorldQuantityPopulation = world.getTotalWorldPopulation();

        //then
        BigDecimal expectedWoldQuantityPopulation = new BigDecimal(0);
        Assert.assertEquals(expectedWoldQuantityPopulation, actualWorldQuantityPopulation);
    }
}
