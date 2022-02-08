package com.kodilla.mockito.homework;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Monity {

    private Map<Location, List<Customer>> notifications = new HashMap<>();


    public void addSubscriberToLocation(Location location, Customer customer) {
        if (notifications.containsKey(location)) {
            notifications.get(location).add(customer);
        } else {
            List<Customer> customers = new ArrayList<>();
            customers.add(customer);
            notifications.put(location, customers);
        }


    }

    public void sendNotifications(Notification notification, Location location) {
        if (notifications.containsKey(location)) {
            notifications.get(location).forEach(customer -> customer.receive(notification));
        }
    }

    List<Customer> customers = new ArrayList<>();
    public void sendNotificationsToAllCustomers (Notification notification) {

        customers.forEach(customer -> customer.receive(notification));
    }

    public void addSubscriber(Customer customer) {
        customers.add(customer);
    }


    public void removeSubscribedLocation(Customer customer, Location location) {
        if (notifications.containsKey(location)) {
            notifications.get(location).remove(customer);
        }
    }

    public void removeCustomerFromAllLocations(Customer customer) {
        notifications.values().forEach(customers -> customers.remove(customer));

    }


    public void removeLocation(Location location) {
        this.notifications.remove(location);
    }
}
