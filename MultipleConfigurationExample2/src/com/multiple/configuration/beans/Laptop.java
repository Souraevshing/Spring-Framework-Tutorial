package com.multiple.configuration.beans;

public class Laptop {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean start() {
        System.out.println("Laptop started...");
        return true;
    }

    public Laptop() {
        System.out.println("instance of laptop created");
    }
}
