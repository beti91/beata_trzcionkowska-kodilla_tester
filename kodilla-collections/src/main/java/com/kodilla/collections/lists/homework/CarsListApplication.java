package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Mercedes(50));
        cars.add(new Volvo(60));
        cars.add(new Toyota(70));

        Volvo volvo = new Volvo(60);

        for(Car car: cars) {
            CarUtils.describeCar(car); }

            cars.remove(0);
            cars.remove(volvo);

            for(Car car: cars) {
                CarUtils.describeCar(car);
                System.out.println(cars.size());

            }
    }
}
