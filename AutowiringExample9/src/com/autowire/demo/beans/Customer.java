package com.autowire.demo.beans;

public class Customer {

    private String name;
    private int age;
    private Account account;
    private Address address;

    public Customer(Account account, Address address) {
        this.account = account;
        this.address = address;
        System.out.println("2 param cons called");
    }

    public Customer(String name, int age, Account account, Address address) {
        this.name = name;
        this.age = age;
        this.account = account;
        this.address = address;
        System.out.println("4 param cons called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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
