package com.kodilla.spring.basic.dependency_injection.homework;

public class TruckDeliveryService implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight >1000) {
            System.out.println("Package too heavy...");
            return false;
        }
        System.out.println("Package delivered by truck");
        return true;
    }
}
