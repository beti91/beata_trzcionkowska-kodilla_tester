package com.kodilla.spring.basic.dependency_injection.homework;

public class CarDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 10 && weight < 200) {
            System.out.println("Package delivered by car");
            System.out.println("Package delivered to: " + address);
        } else {
            System.out.println("Package not delivered by car");
            System.out.println("Package not delivered to: " + address);
        }
        return true;
    }
}

