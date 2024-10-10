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

    public Customer(Account account, Address address) {
        this.account = account;
        this.address = address;
        System.out.println("Account - Address cons called");
    }

    public Customer(Address address, Account account) {
        this.account = account;
        this.address = address;
        System.out.println("Address - Account cons called");
    }

    public void display() {
        System.out.printf("Customer Name: %s\n", name);
        System.out.printf("Age: %s\n", age);
        System.out.printf("Account id: %s\n", account.getAccountId());
        System.out.printf("Balance: %s\n",account.getBalance());
        System.out.printf("house no: %s\n", address.getHouseNo());
        System.out.printf("City: %s\n",address.getCity());
    }

}
