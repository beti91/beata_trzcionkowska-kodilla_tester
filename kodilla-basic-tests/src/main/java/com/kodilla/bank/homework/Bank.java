package com.kodilla.bank.homework;

public class Bank {
    private int[] cashMachine;
    private int size;

    public Bank() {

        this.cashMachine = new int[0];
        this.size = 0;
    }

    public void add(int cashMachines) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(cashMachine, 0, newTab, 0, cashMachine.length);
        newTab[this.size - 1] = cashMachines;
        this.cashMachine = newTab;

    }

    public int[] getCashMachines() {
        return cashMachine;
    }

    public int bilans() {
        int sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum += cashMachine[i];
        }
        return sum;
    }

    public int quantityOfCashWithDrawal() {
        int cash = 0;
        for (int i = 0; i < size; i++) {
            if (cashMachine[i] < 0) {
                cash++;
            }
        }
        return cash;
    }

    public int quantityOfCashDeposit() {
        int cash = 0;
        for (int i = 0; i < size; i++) {
            if (cashMachine[i] > 0) {
                cash++;
            }
        }
        return cash;
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum += cashMachine[i];
        }
        return sum / cashMachine.length;

    }
}


