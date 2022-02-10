package com.kodilla.spring.basic.dependency_injection.homework;

public class BikeDeliveryService implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight >10) {
            System.out.println("Package too heavy for bike delivering");
            return false;
        }
        System.out.println("Package delivered by bike");
        return true;
    }
}
