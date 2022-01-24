package com.kodilla.expection.homework;

public class WarehouseApp {
    public static void main(String[] args) {
Warehouse warehouse = new Warehouse();
warehouse.addOrder(new Order("01"));
warehouse.addOrder(new Order("02"));
warehouse.addOrder(new Order("03"));
        try {
            warehouse.getOrder("04");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order do not exist.");
        } finally {
            System.out.println("Thank you for using our warehouse.");

        }

    }
}
