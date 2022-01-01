package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat();
        kwadrat.circuit();
        kwadrat.surfaceArea();

        Prostokat prostokat = new Prostokat();
        prostokat.circuit();
        prostokat.surfaceArea();

        Trojkat trojkat = new Trojkat();
        trojkat.circuit();
        trojkat.surfaceArea();
    }
}
