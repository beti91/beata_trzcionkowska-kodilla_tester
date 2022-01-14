package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values =cashMachine.getValues();
        assertEquals(0, values.length);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(400);
        cashMachine.add(1000);

        int[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(400, values[0]);
        assertEquals(1000, values[1]);
    }
    @Test
    public void shouldHave500Saldo() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(500);
        cashMachine.add(-500);

        assertEquals(500, cashMachine.saldo());


    }
    @Test
    public void shouldHaveTwoQuantity() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(500);

        assertEquals(2, cashMachine.quantity());
    }

}
