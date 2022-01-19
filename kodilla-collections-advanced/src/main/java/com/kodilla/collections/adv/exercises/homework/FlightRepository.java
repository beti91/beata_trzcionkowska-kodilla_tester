package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightRepository {



    public static void getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Cracow", "Barcelona"));
        flights.add(new Flight("Cracow", "LA"));
        flights.add(new Flight("Cracow", "London"));
        flights.add(new Flight("Warsaw", "London"));


    }


}
