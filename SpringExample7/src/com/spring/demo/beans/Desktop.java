package com.spring.demo.beans;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("desktop created");
    }

    @Override
    public boolean start() {
        System.out.println("Desktop started");
        return true;
    }

}
