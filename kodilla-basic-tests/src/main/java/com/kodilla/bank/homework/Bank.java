package com.kodilla.bank.homework;

public class Bank {
    private int[] cashMachines;
    private int size;

    public Bank() {

        this.cashMachines = new int[0];
        this.size = 0;
    }

    public void add(int cashMachine) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;

    }

    public int[] getCashMachines() {
        return cashMachines;
    }

    public int bilans() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i];
        }
        return sum;
    }

    public int quantityOfCashWithDrawal() {
        int cash = 0;
        for (int i = 0; i < size; i++) {
            if (cashMachines[i] < 0) {
                cash++;
            }
        }
        return cash;
    }

    public int quantityOfCashDeposit() {
        int cash = 0;
        for (int i = 0; i < size; i++) {
            if (cashMachines[i] > 0) {
                cash++;
            }
        }
        return cash;
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i];
        }
        return sum / cashMachines.length;

    }
}


