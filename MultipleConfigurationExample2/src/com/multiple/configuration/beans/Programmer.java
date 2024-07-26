package com.multiple.configuration.beans;

public class Programmer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void writeCode() {
        boolean res=laptop.start();
        if (!res) {
            System.out.println("Could not write code. Laptop not strated...");
        } else {
            System.out.println("Laptop started...Coding started....");
        }
    }

    public Programmer() {
    }

    private Laptop laptop;

}
