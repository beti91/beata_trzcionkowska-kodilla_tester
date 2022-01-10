package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(60);
        System.out.println(mercedes.getSpeed());
       mercedes.increaseSpeed();
       mercedes.decreaseSpeed();
       doRace(mercedes);

       Volvo volvo = new Volvo(50);
       System.out.println(volvo.getSpeed());
       volvo.increaseSpeed();
       volvo.decreaseSpeed();
       doRace(volvo);

       Toyota toyota =  new Toyota(40);
       System.out.println(toyota.getSpeed());
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
    }
}
