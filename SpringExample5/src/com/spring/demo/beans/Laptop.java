package com.spring.demo.beans;

public class Laptop {

    private String brand;

    public Laptop() {
        System.out.println("laptop created");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("setter for name called");
    }
}
