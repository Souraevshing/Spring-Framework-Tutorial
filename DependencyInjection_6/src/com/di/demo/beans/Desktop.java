package com.di.demo.beans;

public class Desktop implements Computer {

    public Desktop(String name) {
        System.out.println("Desktop: "+name);
    }

    @Override
    public boolean start() {
        System.out.println("Desktop started...");
        return true;
    }

}
