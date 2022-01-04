package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b=8;
        int sumResult = calculator.sum(a,b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int subtractResult = calculator.subtract(a,b);
        assertEquals(5,subtractResult);
    }
    @Test
    public void testSquareNegativeNumber() {
        Calculator calculator =  new Calculator();
        double a = -5;
        double squareResult = calculator.square(a);
assertEquals(25.00,squareResult,0.01);
    }
    @Test
    public void testSquareZeroNumber() {
        Calculator calculator = new Calculator();
        double a = 0;
        double squareResult = calculator.square(a);
        assertEquals(0.00, squareResult, 0.01);
    }
    @Test
    public void testSquarePositiveNumber() {
        Calculator calculator = new Calculator();
        double a = 5;
        double squareResult = calculator.square(a);
        assertEquals(25.00, squareResult, 0.01);
    }
}
