package edu.aau.stv;

/** A minimal bank account: the target for unit testing in Part A. */
public class Account {

    private double balance;

    public Account(double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("opening balance cannot be negative");
        }
        this.balance = openingBalance;
    }

    public double balance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("insufficient funds");
        }
        balance -= amount;
    }
}
