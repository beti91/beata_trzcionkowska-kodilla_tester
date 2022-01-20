package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightRepository = new ArrayList<>();
        flightRepository.add(new Flight("Cracow", "Barcelona"));
        flightRepository.add(new Flight("Cracow", "LA"));
        flightRepository.add(new Flight("Cracow", "London"));
        return flightRepository;
    }
}
