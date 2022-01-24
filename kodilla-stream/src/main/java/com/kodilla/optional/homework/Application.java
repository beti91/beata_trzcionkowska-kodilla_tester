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

            Optional<Teacher> optionalStudent = Optional.ofNullable(student.teacher);
          optionalStudent.ifPresent(u-> System.out.println("uczen:" + u.getName() + ",nauczyciel" + u.getName()));


        }


        }
    }

