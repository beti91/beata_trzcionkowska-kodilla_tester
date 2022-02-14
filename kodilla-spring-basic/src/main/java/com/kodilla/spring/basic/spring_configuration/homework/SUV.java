package com.kodilla.spring.basic.spring_configuration.homework;


import java.time.LocalTime;

public class SUV implements Car{


    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime start, LocalTime stop, LocalTime now) {
        if (!now.isBefore(start) && now.isBefore(stop)) {
            return false; }
        return true;
    }

    @Override
    public String getTypeCar(String type) {
        return "SUV";
    }
}
