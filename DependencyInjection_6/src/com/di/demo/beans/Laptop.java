package com.di.demo.beans;

public class Laptop implements Computer {

    public Laptop(String name) {
        System.out.println("Laptop: "+name);
    }

    @Override
    public boolean start() {
        System.out.println("Laptop started...");
        return true;
    }

}
