package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
@Scope("prototype")

public class Clock {



    public LocalTime Clock(LocalDateTime clock) {
        return clock.toLocalTime();
    }

    @Override
    public String toString() {
        return "Clock{}";
    }
}
