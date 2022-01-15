package com.kodilla.collections.adv.maps.homework;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.List;

public class School {


    private List<Double> classes = new ArrayList<>();

    public School(double... classes) {
        for (double school : classes)
            this.classes.add(school);
    }

    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                '}';
    }

    public double getSum() {
        double sum = 0.0;
        for (double school : classes) {
            sum += school;
        }
        return sum;

    }
}


