package com.spring.demo.beans;

public class Customer {

    private String name;
    private Account account;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter called for name");
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
        System.out.println("setter called for account");
    }
}
