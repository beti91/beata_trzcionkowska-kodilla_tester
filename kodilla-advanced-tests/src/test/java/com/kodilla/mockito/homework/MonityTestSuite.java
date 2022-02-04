package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.management.Notification;
import java.time.LocalDate;

public class MonityTestSuite {

    Monity monity = new Monity();
    Customer customer = Mockito.mock(Customer.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void SubscribedCustomerShouldReceiveMonityFromSpecificLocation () {
monity.addSubscriberToLocation(location, customer);

monity.sendNotifications(notification);
Mockito.verify(customer, Mockito.times(1)).receive(notification);


    }
    @Test
    public void UnsubscribedLocationByCustomerShouldNotSendNotificationToCustomer() {
Location London = Mockito.mock(Location.class);
monity.addSubscriberToLocation(location, customer);
monity.addSubscriberToLocation(London, customer);
monity.removeLocation(customer, London);

monity.sendNotifications(notification);
Mockito.verify(customer, Mockito.times(1)).receive(notification);


    }
    @Test
    public void UnsubscribedAllLocationShouldDeletedCustomerFromNotification  () {
        Location London = Mockito.mock(Location.class);
        monity.addSubscriberToLocation(location, customer);
        monity.addSubscriberToLocation(London, customer);
        monity.removeLocation(customer, location);
        monity.removeLocation(customer, London);

        monity.sendNotifications(notification);
        Mockito.verify(customer, Mockito.never()).receive(notification);

    }
    @Test
   public void NotificationFromSpecificLocationShouldBeSendOnlyToSpecificCustomers () {
Customer customer1 = Mockito.mock(Customer.class);
Customer customer2 = Mockito.mock(Customer.class);
Location London = Mockito.mock(Location.class);
monity.addSubscriberToLocation(London, customer);
monity.addSubscriberToLocation(London, customer1);
monity.addSubscriberToLocation(location, customer2);

monity.sendNotifications(notification);
Mockito.verify(customer2, Mockito.times(1)).receive(notification);


    }
    @Test
    public void ShouldSendNotificationToAllCustomers () {
        Customer customer1 = Mockito.mock(Customer.class);
        Customer customer2 = Mockito.mock(Customer.class);

        monity.addSubscriberToLocation(location, customer);


        monity.sendNotifications(notification);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);


    }
    @Test
    public void ShouldDeletedSpecificLocation () {
        Location London = Mockito.mock(Location.class);
        monity.addSubscriberToLocation(location, customer);
        monity.addSubscriberToLocation(London, customer);
        monity.removeLocation(customer, London);

        monity.sendNotifications(notification);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);

    }
}
