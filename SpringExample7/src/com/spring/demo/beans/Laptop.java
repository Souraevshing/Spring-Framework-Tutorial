package com.spring.demo.beans;

public class Laptop implements Computer {

    public Laptop() {
        System.out.println("laptop created");
    }

    @Override
    public boolean start() {
        return true;
    }

}
