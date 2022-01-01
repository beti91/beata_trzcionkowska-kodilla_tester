package com.kodilla.inheritance.homework;

public class OperatingSystem {

private int publicationDate;

public OperatingSystem(int publicationDate) {
    this.publicationDate = publicationDate;
}
public void turnOn() {
    System.out.println("Operating system was turned on");
}
public void turnOff() {
    System.out.println("Operating system was turned off");
}
public int getPublicationDate() {
    return publicationDate;
}
}
