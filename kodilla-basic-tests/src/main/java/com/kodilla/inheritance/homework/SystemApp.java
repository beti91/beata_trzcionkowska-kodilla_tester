package com.kodilla.inheritance.homework;

public class SystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2019);
        operatingSystem.turnOff();
        operatingSystem.turnOn();

        System1 system1 = new System1(2020);
        system1.turnOff();
        system1.turnOn();


        System2 system2 = new System2(2021);
        system2.turnOff();
        system2.turnOn();


    }
}
