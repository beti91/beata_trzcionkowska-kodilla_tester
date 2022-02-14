package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarRent {

    @Bean
    public Car picCar() {
        Car car;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        int zima = 0;
        int wiosna = 1;
        int lato = 2;
        int jesien = 3;
        if (chosen == 0) {
            car = new SUV();
        } else if (chosen == 2) {
            car = new Cabrio();
        } else {
            car = new Sedan();

        }
        return car;

    }

    @Bean
    public boolean lights() {
        Car car;

        return true;
    }
}

