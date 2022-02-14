package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class TruckNotificationService implements NotificationService{
    @Override
    public String success(String address) {
        return "Package delivered to: " + address + ", by truck";

    }

    @Override
    public String fail(String address) {
        return "Package not delivered to: " + address;

    }


}
