package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Polish emblem", "43mm x 31,25mm", true));
        stamps.add(new Stamp("English Queen", "39,5mm x 31,25mm", false));
        stamps.add(new Stamp("Stanislaw August", "90mm x 70mm", true));
        stamps.add(new Stamp("Polish emblem", "43mm x 31,25mm", true));
        stamps.add(new Stamp("Polish emblem", "43mm x 31,25mm", true));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}
