package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnCorrectNotification() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String notification = bean.sendPackage("Krakowska 10", 40);
        Assertions.assertEquals("Package not delivered to: Krakowska 10", notification);

    }

}