package com.kodilla.abstracts.homework;

public class Trojkat extends Shape{
    @Override
    public void surfaceArea() {
        System.out.println("(a*h)/2");
    }

    @Override
    public void circuit() {
        System.out.println("a+b+c");

    }
}
