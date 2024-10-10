package com.autowire.demo.beans;

public class Customer {

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Account id: %s\n", account.getAccountId());
        System.out.printf("Balance: %f", account.getBalance());
    }

    private String name;
    private Account account;

}
