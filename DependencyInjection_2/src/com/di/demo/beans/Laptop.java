package com.di.demo.beans;

/**
 * Programmer will call Laptop,
 * and we are passing argument to Laptop no-arg constructor to test whether Laptop class instance is created or not
 * */
public class Laptop {

    public Laptop(String name) {
        System.out.println("Laptop started: "+name);
    }

    public String start() {
        return "Laptop started...";
    }

}
