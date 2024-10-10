package com.autowire.demo.beans;

public class Customer {

    private String customerName;
    private Account account;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void display() {
        System.out.printf("Customer name: %s\n", customerName);
        System.out.printf("Account id: %s\n", account.getAccountId());
        System.out.printf("Balance: %s\n", account.getBalance());
    }

}
