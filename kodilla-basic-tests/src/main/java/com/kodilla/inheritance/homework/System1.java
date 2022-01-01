package com.kodilla.inheritance.homework;

public class System1 extends OperatingSystem {

    public System1(int publicationDate) {
        super(publicationDate);
        System.out.println("System constructor");
    }
    @Override
    public void turnOn() {
        System.out.println("Operating system is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Operating system is turn off");
    }
}
