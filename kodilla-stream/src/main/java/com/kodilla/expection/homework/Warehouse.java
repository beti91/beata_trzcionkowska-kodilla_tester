package com.kodilla.expection.homework;


import java.util.HashSet;
import java.util.Set;


public class Warehouse {

    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);

    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(u -> u.getNumber().equals(number))
                .findAny().orElseThrow(()-> new OrderDoesntExistException());
    }
}

