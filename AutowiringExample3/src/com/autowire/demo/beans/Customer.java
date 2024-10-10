package com.autowire.demo.beans;

public class Customer {

    private String name;
    private Account account;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void display() {
        System.out.printf("Customer name: %s\n", name);
        System.out.printf("Account id %s\n", account.getAccountId());
        System.out.printf("Balance: %f\n", account.getBalance());
    }

}
