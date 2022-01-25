package com.kodilla.collections.adv.exercises.homework;


import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {



    @Test
    public void testFindFlightsFrom () {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Cracow");
        assertEquals(3, result.size());
    }
@Test
    public void testFinfFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("London");
        assertEquals(1, result.size());
}
}