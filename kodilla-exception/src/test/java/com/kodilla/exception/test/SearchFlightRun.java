package com.kodilla.exception.test;

public class SearchFlightRun {

    public static void main(String[] args) {

        SearchFlight searchFlight = new SearchFlight();
        searchFlight.findFlight(new Flight("Katowice", "Warszawa"));
        searchFlight.findFlight(new Flight("Kraków", "Gdańsk"));
        searchFlight.findFlight(new Flight("Rzeszów", "Warszawa"));
        searchFlight.findFlight(new Flight("Katowice", "Oslo"));
        searchFlight.findFlight(new Flight("Warszawa", "Chicago"));

        try {
            searchFlight.searchFlight("Cieszyn");

        } catch (RouteNotFoundException ex) {

            System.out.println("Exception \"" + ex + "\" was caught.");
        }
    }

}
