package com.kodilla.good.patterns.challenges.airlines;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class FlightRegister {

    private Set<Flight> listOfFlights = new HashSet<Flight>();

    public boolean addFlight (Flight flight){
        listOfFlights.add(flight);
        return true;
    }

    public Set<Flight> getListOfFlights(){
        return Collections.unmodifiableSet(listOfFlights);
    }


}
