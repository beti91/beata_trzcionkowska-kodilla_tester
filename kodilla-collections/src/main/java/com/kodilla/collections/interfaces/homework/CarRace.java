package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(60);
        mercedes.getSpeed();
       mercedes.increaseSpeed();
       mercedes.decreaseSpeed();
       doRace(mercedes);

       Volvo volvo = new Volvo(50);
       volvo.getSpeed();
       volvo.increaseSpeed();
       volvo.decreaseSpeed();
       doRace(volvo);

       Toyota toyota =  new Toyota(40);
       toyota.getSpeed();
       toyota.increaseSpeed();
       toyota.decreaseSpeed();
       doRace(toyota);
    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
