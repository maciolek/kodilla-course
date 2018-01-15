package com.kodilla.good.patterns.challenges.foodproducers.com.kodilla.good.patterns.challenges.airlines;

public class Application {

    public static void main(String[] args) {

        FlightRegister flightRegister = FlightsRetriever.retrieve();

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightRegister.getListOfFlights());
        flightSearchEngine.searchByCityOfDeparture("Warszawa");
        flightSearchEngine.searchByCityOfArrival("Gdańsk");
        flightSearchEngine.searchByCityForTransfer("Katowice","Kraków", "Gdańsk");
    }
}
