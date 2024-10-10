package com.autowire.demo.beans;

public class Customer {

    private String name;
    private int age;
    private Account account;
    private Address address;

    public Customer(String name, int age, Account account, Address address) {
        this.name = name;
        this.age = age;
        this.account = account;
        this.address = address;
    }

    public void display() {
        System.out.printf("Customer name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Account id: %s\n", account.getAccountId());
        System.out.printf("Balance: %f\n", account.getBalance());
        System.out.printf("House no: %s\n", address.getHouseNo());
        System.out.printf("City: %s\n", address.getCity());
    }

}
