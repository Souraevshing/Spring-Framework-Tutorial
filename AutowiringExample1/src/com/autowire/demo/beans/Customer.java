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
        System.out.println("Customer Name:"+name);
        System.out.println("Account id:"+account.getAccountId());   // since an account is null, you will get NullPointerException
        System.out.println("Balance:"+account.getBal());
    }
}
