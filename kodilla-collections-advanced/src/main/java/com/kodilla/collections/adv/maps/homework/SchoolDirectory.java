package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal Nowak = new Principal("Nowak", "dwojka");
        Principal Kowalski = new Principal("Kowalski", "trojka");
        Principal Szwed = new Principal("Szwed","piatka");

        School nowakschools = new School(12,15,25);
        School kowalskischools = new School(20,15,25);
        School szwedschools = new School(20, 25, 30);

        school.put(Nowak, nowakschools);
        school.put(Kowalski, kowalskischools);
        school.put(Szwed, szwedschools);

for(Map.Entry<Principal, School> principalEntry : school.entrySet())
    System.out.println(principalEntry.getKey().getPrincipal() + ", name of school " + principalEntry.getKey().getSchoolName() + " ,sum of classes " +
            principalEntry.getValue().getSum());






    }
}
