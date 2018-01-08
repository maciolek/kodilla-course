package com.kodilla.exception.test;

public class SearchFlightRun {

    public static void main(String[] args) {

        SearchFlight searchFlight = new SearchFlight();
        searchFlight.addFlight(new Flight("Katowice", "Warszawa"));
        searchFlight.addFlight(new Flight("Kraków", "Gdańsk"));
        searchFlight.addFlight(new Flight("Rzeszów", "Warszawa"));
        searchFlight.addFlight(new Flight("Katowice", "Oslo"));
        searchFlight.addFlight(new Flight("Warszawa", "Chicago"));

        try {
            searchFlight.searchFlight("Cieszyn");

        } catch (RouteNotFoundException ex) {

            System.out.println("Caught exception : " + ex);
        }
    }
}
