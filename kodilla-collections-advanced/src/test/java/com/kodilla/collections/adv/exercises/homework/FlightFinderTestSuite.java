package com.kodilla.collections.adv.exercises.homework;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {



    @Test
    public void testFindFlightsFrom () {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.(new Flight("Cracow", "London"));

     List<Flight> result = flightFinder.findFlightsFrom("Cracow");














    }

}