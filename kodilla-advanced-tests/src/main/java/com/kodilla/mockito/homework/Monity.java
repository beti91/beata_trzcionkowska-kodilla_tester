package com.kodilla.mockito.homework;

import javax.management.Notification;
import java.util.HashMap;
import java.util.Map;

public class Monity {

    private Map<Location, Customer> notifications = new HashMap<>();


    public void addSubscriberToLocation (Customer customer, Location location) {
        this.notifications.put(location, customer);
    }
    public void sendNotifications(Notification notification) {
        this.notifications.forEach((customer, location) -> customer.receive(notification));
    }
    public void removeLocation(Customer customer, Location location) {
        this.notifications.remove(location);
    }
    public void removeCustomer(Customer customer, Location location) {
        this.notifications.remove(customer);
    }
}
