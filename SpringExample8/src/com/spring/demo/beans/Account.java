package com.spring.demo.beans;

public class Account {

    private String accountId;
    private double balance;

    public Account() {
        System.out.println("account instance created");
    }


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
        System.out.println("setter called for accId");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("setter called for balance");
    }
}
