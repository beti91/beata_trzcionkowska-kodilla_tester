package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new TruckDeliveryService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService);
        shippingCenter.sendPackage("Hill Street 11, New York", 500);
    }
}
