package com.kodilla.exception.test;

import java.util.HashMap;

public class SearchFlight {

    private HashMap<String, Boolean> flightPlan = new HashMap<>();

    public HashMap<String, Boolean> addFlight(Flight flight) {

        flightPlan.put(flight.getArrivalAirport(), true);
        flightPlan.put(flight.getDepartureAirport(), true);
        return flightPlan;
    }

    public void searchFlight(String searchingAirport) throws RouteNotFoundException {

        if (!flightPlan.containsKey(searchingAirport)) {
            throw new RouteNotFoundException(searchingAirport);
        }
        System.out.println("You can book this flight.");
    }

}






