package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightFinder {

    List<Flight> flightFinder = new ArrayList<>();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightFinder) {
            if (flight.getDeparture().equals(departure)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightFinder) {
            if (flight.getArrival().equals(arrival)) {
                result.add(flight);
            }
        }
        return result;


    }
    public void add(String departure, String arrival) {
        List<Flight> flights = flightFinder.

    }
}
