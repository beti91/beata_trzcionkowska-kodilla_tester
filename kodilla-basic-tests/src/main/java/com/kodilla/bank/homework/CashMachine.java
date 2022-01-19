package com.kodilla.bank.homework;

public class CashMachine {

    private int[] values;
    private int size;


    public CashMachine() {
        this.size = 0;
        this.values = new int[0];

    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }

    public int saldo() {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public int quantity() {
        return this.size;
    }

    public int quantityOfCashWithDrawal() {
        int cash = 0;
        for (int i = 0; i < size; i++) {
            if (values[i] < 0) {
                cash++;
            }
        }
        return cash;
    }

    public int quantityOfCashDeposit() {
        int cash = 0;
        for (int i = 0; i < size; i++) {
            if (values[i] > 0) {
                cash++;
            }
        }
        return cash;
    }

    public int saldominus() {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                sum += values[i];
            }
        }
        return sum;
    }

    public int saldoplus() {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                sum += values[i];
            }
        }
        return sum;
    }
}
