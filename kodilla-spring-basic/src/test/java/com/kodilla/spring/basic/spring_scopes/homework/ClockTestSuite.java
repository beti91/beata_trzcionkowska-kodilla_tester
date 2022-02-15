package com.kodilla.spring.basic.spring_scopes.homework;

import com.kodilla.spring.basic.spring_scopes.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

@Test
    public void shouldReturnDifferentTime() throws InterruptedException {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    Clock firstBean = context.getBean(Clock.class);
    Thread.sleep(1000L);
    Clock secondBean = context.getBean(Clock.class);
    Thread.sleep(1000L);
    Clock thirdBean = context.getBean(Clock.class);
    Assertions.assertNotEquals(firstBean.getClock(), secondBean.getClock());
    Assertions.assertNotEquals(secondBean.getClock(), thirdBean.getClock());
    Assertions.assertNotEquals(firstBean.getClock(), thirdBean.getClock());
}

}