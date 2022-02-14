package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class TruckDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 2000) {
            return false;
        }
        return true;
    }
}
