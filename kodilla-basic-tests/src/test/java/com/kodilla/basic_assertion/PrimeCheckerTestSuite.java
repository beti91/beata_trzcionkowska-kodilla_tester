package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    private PrimeChecker checker = new PrimeChecker();
    private static int count = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        boolean result = checker.isPrime(14);
        count++;
        checker.incrementCount();
        System.out.println("Test number" + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingNotPrimeNumber() {
        boolean result = checker.isPrime(13);
        count++;
        checker.incrementCount();
        System.out.println("Test number " + count);
        assertTrue(result);
    }

    @Test
    public void ShouldReturnTrueWhenPassingTwo() {
        boolean result = checker.isPrime(2);
        count++;
        checker.incrementCount();
        System.out.println("Test number" + count);
        assertTrue(result);
    }
    @Test
    public void ShouldReturnFalseWhenPassingOne() {
        boolean result = checker.isPrime(1);
        count++;
        checker.incrementCount();
        System.out.println("Test number" + count);
        assertFalse(result);
    }
    @Test
    public void ShouldReturnFalseWhenPassingZero() {
        boolean result = checker.isPrime(0);
        checker.incrementCount();
        count++;
        System.out.println("Test number" + count);
        assertFalse(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        boolean result = checker.isPrime(-6);
        checker.incrementCount();
        count++;
        System.out.println("Test number" + count);
        assertFalse(result);
    }
}
