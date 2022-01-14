package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLength () {
        Bank bank = new Bank();
        int[] cashMachines = bank.getCashMachines();
        assertEquals(0, cashMachines.length);
    }
    @Test
    public void shouldHave1000bilans () {
        Bank bank = new Bank();
        bank.add(200);
        bank.add(-200);
        bank.add(500);
        bank.add(500);

        assertEquals(1000, bank.bilans());

    }
    @Test
    public void shouldHaveQuantityOfCashWithdrawal () {
        Bank bank = new Bank();
        bank.add(500);
        bank.add(-500);

        assertEquals(1, bank.quantityOfCashWithDrawal());
    }
    @Test
    public void shouldHaveQuantityOfCashDeposit() {
        Bank bank = new Bank();
        bank.add(500);
        bank.add(100);
        bank.add(-100);

        assertEquals(2, bank.quantityOfCashDeposit());
    }

    @Test
    public void shouldHaveAverageMinus () {
        Bank bank = new Bank();
        bank.add(-100);
        bank.add(-100);
        bank.add(100);

        assertEquals(-33.3, bank.average(), 0.1);
    }
}
