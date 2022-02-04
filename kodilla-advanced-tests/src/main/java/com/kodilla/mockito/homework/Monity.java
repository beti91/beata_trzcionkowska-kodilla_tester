package com.kodilla.mockito.homework;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Monity {

    private Map<Location, List<Customer>> notifications = new HashMap<>();


    public void addSubscriberToLocation (Location location, Customer customer) {

    }
    public void sendNotifications(Notification notification) {

       }



    public void removeLocation(Customer customer, Location location) {
        this.notifications.remove(location);
    }
    public void removeCustomer(Customer customer, Location location) {
        this.notifications.remove(customer);
    }
}
