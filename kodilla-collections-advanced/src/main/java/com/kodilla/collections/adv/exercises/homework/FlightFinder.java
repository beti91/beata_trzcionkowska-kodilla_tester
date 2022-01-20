package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightFinder {

    List<Flight> flightRepository = new ArrayList<>();

    public List<Flight> findFlightsFrom(String departure) {
List<Flight> result = new ArrayList<>();
for (Flight flight: flightRepository) {
    if (flight.getDeparture().equals(departure)) {
        return result;
    }
}
return result;
    }



}
