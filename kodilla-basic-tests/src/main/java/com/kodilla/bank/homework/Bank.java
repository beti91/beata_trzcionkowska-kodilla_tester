package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank() {

        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;

    }


    public int bilans() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += cashMachines[i].saldo();
        }
        return sum;
    }

    public int quantityOfCashWithDrawal() {
        int cash = 0;
        for (int i = 0; i < size; i++) {
            cash += cashMachines[i].quantityOfCashWithDrawal();
        }
        return cash;
    }

    public int quantityOfCashDeposit() {
        int cash = 0;
        for (int i = 0; i < size; i++) {
            cash += cashMachines[i].quantityOfCashDeposit();
        }
        return cash;
    }

    public double average() {
        double sum = bilans();
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            quantity += cashMachines[i].quantity();
        }
        return sum / quantity;

    }

    public double averageminus() {
        double sum = 0;
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            sum += cashMachines[i].saldominus();
            quantity += cashMachines[i].quantityOfCashWithDrawal();
        }
        return sum / quantity;
    }
    public double averageplus() {
        double sum = 0;
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            sum += cashMachines[i].saldoplus();
            quantity += cashMachines[i].quantityOfCashDeposit();
        }
        return sum / quantity;

}
}


