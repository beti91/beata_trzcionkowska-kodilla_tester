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
monity.addSubscriberToLocation(customer, location);

monity.sendNotifications(notification);
Mockito.verify(location, Mockito.times(1)).receive(notification);
    }

    @Test
    public void UnsubscribedLocationByCustomerShouldNotSendNotificationToCustomer () {
        monity.addSubscriberToLocation(customer, location);
        monity.addSubscriberToLocation(customer, location);
        monity.removeLocation(customer, location);

        monity.sendNotifications(notification);
        Mockito.verify(location, Mockito.times(1)).receive(notification);

    }
    @Test
    public void UnsubscribedAllLocationShouldDeletedCustomerFromNotification  () {
monity.addSubscriberToLocation(customer, location);
monity.removeCustomer(customer, location);

monity.sendNotifications(notification);
Mockito.verify(location, Mockito.never()).receive(notification);

    }
    @Test
   public void NotificationFromSpecificLocationShouldBeSendOnlyToSpecificCustomers () {


    }
    @Test
    public void ShouldSendNotificationToAllCustomers () {

    }
    @Test
    public void ShouldDeletedSpecificLocation () {

    }
}
