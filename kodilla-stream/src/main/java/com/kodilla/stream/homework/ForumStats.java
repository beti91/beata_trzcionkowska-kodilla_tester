package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.function.Predicate;

public class ForumStats {
    private static Predicate<User> userPredicate;

    public static void main(String[] args) {
        double avg1 = UsersRepository.getUsersList()
                .stream()
                .filter(c -> c.getAge() >= 40)
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg1);

        double avg2 = UsersRepository.getUsersList()
                .stream()
                .filter(c -> c.getAge() < 40)
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg2);
    }
}
