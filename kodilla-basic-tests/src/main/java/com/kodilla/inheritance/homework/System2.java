package com.kodilla.inheritance.homework;

public class System2 extends System1 {
    public System2(int publicationDate) {
        super(publicationDate);
        System.out.println("System 2 constructor");
    }
    @Override
    public void turnOn() {
        System.out.println("Operating system will be turn on");
    }
    @Override
    public void turnOff() {
        System.out.println("Operating system will be turn off");
    }
}

