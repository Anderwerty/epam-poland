package com.shylin.bank.entity;

public class Account {
    private final Integer id;
    private final double balance;

    public Account(Integer id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(Account account, double newBalance) {
        this.id = account.id;
        this.balance = newBalance;
    }

    public Integer getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
