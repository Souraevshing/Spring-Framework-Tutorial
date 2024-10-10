package com.autowire.demo.beans;

public class Customer {

    public Customer(Account account) {
        System.out.println("Customer cons called");
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void display() {
        System.out.printf("Customer name: %s\n", name);
        System.out.printf("Account id: %s\n", account.getAccountId());
        System.out.printf("Balance: %f\n", account.getBalance());
    }

    private String name;
    private Account account;

}
