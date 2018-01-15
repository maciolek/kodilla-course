package com.kodilla.good.patterns.challenges.foodproducers.com.kodilla.good.patterns.challenges.airlines;

public class FlightsRetriever {

    public static FlightRegister retrieve() {

        Flight flight1 = new Flight("Katowice", "Warszawa", 3855);
        Flight flight2 = new Flight("Katowice", "Rzeszów", 4855);
        Flight flight3 = new Flight("Warszawa", "Gdańsk", 3849);
        Flight flight4 = new Flight("Katowice", "Gdańsk", 8951);
        Flight flight5 = new Flight("Warszawa", "Rzeszów", 5051);
        Flight flight6 = new Flight("Kraków", "Gdańsk", 7231);
        Flight flight7 = new Flight("Katowice", "Kraków", 4567);
        Flight flight8 = new Flight("Katowice", "Warszawa", 2549);
        Flight flight9 = new Flight("Katowice", "Warszawa", 8080);
        Flight flight10 = new Flight("Kraków", "Gdańsk", 9864);

        FlightRegister flightRegister = new FlightRegister();
        flightRegister.addFlight(flight1);
        flightRegister.addFlight(flight2);
        flightRegister.addFlight(flight3);
        flightRegister.addFlight(flight4);
        flightRegister.addFlight(flight5);
        flightRegister.addFlight(flight6);
        flightRegister.addFlight(flight7);
        flightRegister.addFlight(flight8);
        flightRegister.addFlight(flight9);
        flightRegister.addFlight(flight10);

        return flightRegister;
    }
}
