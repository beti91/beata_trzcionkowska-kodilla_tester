package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank = new Bank();
    CashMachine cashMachine = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine CashMachine3 = new CashMachine();
    @BeforeEach
    public void prepare() {
        cashMachine.add(-200);
        cashMachine.add(100);
        cashMachine2.add(-300);
        cashMachine2.add(200);
        CashMachine3.add(100);
        bank.add(cashMachine);
        bank.add(cashMachine2);
        bank.add(CashMachine3);
    }
    @Test
    public void shouldHave1000bilans () {

        assertEquals(-100, bank.bilans());
    }
    @Test
    public void shouldHaveQuantityOfCashWithdrawal () {

        assertEquals(2, bank.quantityOfCashWithDrawal());}
    @Test
    public void shouldHaveQuantityOfCashDeposit() {

        assertEquals(3, bank.quantityOfCashDeposit());
    }
    @Test
    public void testAverageMinus() {

        assertEquals(-250, bank.averageminus(), 0.01);
    }
    @Test
    public void testAveragePlus() {

        assertEquals(133.3, bank.averageplus(), 0.1);
    }
}
