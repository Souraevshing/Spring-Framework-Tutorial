package com.autowire.demo.beans;

public class Customer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void display() {
        System.out.printf("Customer name: %s", name);
        System.out.printf("Account id: %s", account.getAccountId());
        System.out.printf("Balance: %f", account.getBalance());
    }

    private Account account;

    public Customer(Account account) {
        System.out.println("Customer cons called");
        this.account = account;
    }

}
