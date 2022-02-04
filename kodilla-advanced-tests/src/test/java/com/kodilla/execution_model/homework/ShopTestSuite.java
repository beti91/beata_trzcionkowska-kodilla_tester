package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order laptop = new Order(2500, LocalDate.of(2021, 12, 26), "Beti");
    Order TV = new Order(2000, LocalDate.of(2022, 1, 2), "NoMater");
    Order WashingMachine = new Order(1500, LocalDate.of(2021, 10, 20), "WhatEver");
    Order Dishwasher = new Order(1200, LocalDate.of(2021, 9, 10), "Kowalski");

    @BeforeEach
    public void initializeOrders() {
        shop.addOrder(laptop);
        shop.addOrder(TV);
        shop.addOrder(WashingMachine);
        shop.addOrder(Dishwasher);
    }

    @Test
    public void shouldAddOrder() {

        int numbersOfOrders = shop.getQuantity();
        assertEquals(4, numbersOfOrders);
}
@Test
    public void shouldReturnOrdersFromTwoDates() {

    Order result = shop.getOrdersFromDates(LocalDate.of(2021,11,1), LocalDate.of(2021,12,27));
    assertEquals(laptop, result);
}
@Test
    public void shouldReturnOrdersBetweenValues() {
        List result = shop.getOrderbetweenValues(1500,1600);
        List<Order> expected = new ArrayList<>();
        expected.add(WashingMachine);
        assertEquals(expected, result);
}
@Test
    public void shouldReturnSumOfValuesOrders() {
        double result = shop.getValuesOfOrders();
        assertEquals(7200, result);

}
}