package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aaB", "Katy998", "Bett.i_", "Bea-ta1"})
    public void shouldReturnTrueForCorrectUsersNames(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"beatat91@gmail.com", "katy.perry@wp.pl", "bett_i9@o2.com"})
    public void shouldReturnTrueForCorrectEmailAddress(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }
}