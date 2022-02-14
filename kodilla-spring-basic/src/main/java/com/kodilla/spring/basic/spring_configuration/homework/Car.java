package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Car {

    public boolean hasHeadlightsTurnedOn(LocalTime start, LocalTime stop, LocalTime now);

    String getTypeCar();
}
