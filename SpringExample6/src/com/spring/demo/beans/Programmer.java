package com.spring.demo.beans;

public class Programmer {

    private Laptop laptop;
    private String name;

    public Programmer() {
        System.out.println("programmer called");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("laptop created");
        System.out.println("setter for laptop called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter for name called");
    }
}
