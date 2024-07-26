package com.multiple.configuration.beans;

public class Laptop {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Laptop() {
        System.out.println("instance of laptop created");
    }

    private String brand;

}
