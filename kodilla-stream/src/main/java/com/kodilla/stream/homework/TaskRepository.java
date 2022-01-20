package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

public static List<Task> getTask() {
    List<Task> tasks = new ArrayList<>();
    tasks.add(new Task("cleaning", LocalDate.of(2022,1,1), LocalDate.now()));
    tasks.add(new Task("feed the cat", LocalDate.of(2022,1,19), LocalDate.of(2022,1,1)));
    tasks.add(new Task("buy new car", LocalDate.of(2022,1,1), LocalDate.of(2022,6,30)));
    tasks.add(new Task("renovate bathroom",LocalDate.of(2022,1,10), LocalDate.of(2022,7,1)));
    return tasks;
}
}
