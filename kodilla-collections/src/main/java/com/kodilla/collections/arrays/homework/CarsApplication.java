package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for(int n=0; n<cars.length; n++)
            cars[n] = drawCar();
        for( Car car: cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(3);
        int a = random.nextInt(200);
        int b = random.nextInt(200);
        int c = random.nextInt(200);
        if (drawCarKind==0)
            return new Mercedes(a);
        else if (drawCarKind==1)
            return new Volvo(b);
        else
            return new Toyota(c);
    }
}
