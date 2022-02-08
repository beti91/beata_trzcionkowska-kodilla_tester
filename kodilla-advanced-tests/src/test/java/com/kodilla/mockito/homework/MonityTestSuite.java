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
    public void SubscribedCustomerShouldReceiveNotificationFromSpecificLocation () {
monity.addSubscriberToLocation(location, customer);

monity.sendNotifications(notification, location);
Mockito.verify(customer, Mockito.times(1)).receive(notification);

    }
    @Test

    public void shouldAddCustomerToExistingLocation () {
        monity.addSubscriberToLocation(location, customer);
        Customer customer1 = Mockito.mock(Customer.class);
        monity.addSubscriberToLocation(location, customer1);

        monity.sendNotifications(notification, location);
        Mockito.verify(customer1, Mockito.times(1)).receive(notification);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);
    }

    @Test
    public void UnsubscribedLocationByCustomerShouldNotSendNotificationToCustomer() {
        Location London = Mockito.mock(Location.class);
        monity.addSubscriberToLocation(location, customer);
        monity.addSubscriberToLocation(London, customer);
        monity.removeSubscribedLocation(customer, location);

        monity.sendNotifications(notification, location);
        Mockito.verify(customer, Mockito.never()).receive(notification);
    }

@Test
    public void shouldReceiveNotificationFromNotDeletedLocation() {
    Location London = Mockito.mock(Location.class);
    monity.addSubscriberToLocation(location, customer);
    monity.addSubscriberToLocation(London, customer);
    monity.removeSubscribedLocation(customer, location);

    monity.sendNotifications(notification, London);
    Mockito.verify(customer, Mockito.times(1)).receive(notification);
}



    @Test
    public void UnsubscribedAllLocationShouldDeletedCustomerFromNotification  () {
        Location London = Mockito.mock(Location.class);
        monity.addSubscriberToLocation(location, customer);
        monity.addSubscriberToLocation(London, customer);
        monity.removeCustomerFromAllLocations(customer);


        monity.sendNotifications(notification, location);
        monity.sendNotifications(notification, London);
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

monity.sendNotifications(notification, London);
Mockito.verify(customer, Mockito.times(1)).receive(notification);
Mockito.verify(customer1, Mockito.times(1)).receive(notification);
Mockito.verify(customer2, Mockito.never()).receive(notification);
    }
    @Test
    public void ShouldSendNotificationToAllCustomers () {
        Customer customer1 = Mockito.mock(Customer.class);
        Customer customer2 = Mockito.mock(Customer.class);

        monity.addSubscriber(customer1);
        monity.addSubscriber(customer2);


        monity.sendNotificationsToAllCustomers(notification);
        Mockito.verify(customer1, Mockito.times(1)).receive(notification);
        Mockito.verify(customer2, Mockito.times(1)).receive(notification);

    }
    @Test
    public void ShouldDeletedSpecificLocation () {
        Location London = Mockito.mock(Location.class);
        monity.addSubscriberToLocation(location, customer);
        monity.addSubscriberToLocation(London, customer);
        monity.removeLocation(London);

        monity.sendNotifications(notification, London);
        Mockito.verify(customer, Mockito.never()).receive(notification);

    }
}
