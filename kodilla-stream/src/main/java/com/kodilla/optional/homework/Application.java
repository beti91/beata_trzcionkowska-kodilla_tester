package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Stefan", null));
        students.add(new Student("Adam", new Teacher("Nowak")));
        students.add(new Student("Beata", new Teacher("Kowalski")));
        students.add(new Student("Agnieszka", new Teacher("Podolski")));

        for (Student student : students) {

            Teacher teacher = Optional.ofNullable(student.teacher).orElse(new Teacher("<undefined>"));
            System.out.println("uczen:" + student.getName() + ",nauczyciel" + teacher.getName());

        }


        }



    }

