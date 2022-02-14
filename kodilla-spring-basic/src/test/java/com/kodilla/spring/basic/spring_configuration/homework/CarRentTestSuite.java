package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CarRentTestSuite {

    @Test
    public void shouldPickCar() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("picCar");
        String type = car.getTypeCar();
        System.out.println(type);

        List<String> types = Arrays.asList("Cabrio","SUV","Sedan");
        Assertions.assertTrue(types.contains(type));
    }

}