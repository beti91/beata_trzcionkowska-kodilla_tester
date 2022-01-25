package com.kodilla.collections.adv.exercises.homework;

import java.util.List;

public class FlightApplication {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> FlightsFromCracow = flightFinder.findFlightsFrom("Cracow");
        System.out.println(FlightsFromCracow);

        List<Flight> FlightsToLondon = flightFinder.findFlightsTo("London");
        System.out.println(FlightsToLondon);
    }
}
