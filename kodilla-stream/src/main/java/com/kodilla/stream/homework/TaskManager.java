package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTask()
        .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(TaskManager::getDeadlineDate)
                .collect(Collectors.toList());
        System.out.println(deadlines);


    }



public static LocalDate getDeadlineDate(Task task) {
        return task.getDeadline();
}
}
