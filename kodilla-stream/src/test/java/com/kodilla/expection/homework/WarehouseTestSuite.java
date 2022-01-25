package com.kodilla.expection.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTestSuite {
    @Test
    public void testgetOrder() throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("01"));
        warehouse.addOrder(new Order("04"));

 Order getOrder01 = warehouse.getOrder("04");
 assertNotNull(getOrder01);



    }
    @Test
    public void testgetOrder_withException() {

        Warehouse warehouse = new Warehouse();

        assertThrows(OrderDoesntExistException.class,()-> warehouse.getOrder("04"));
    }

}