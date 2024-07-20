package com.di.demo.beans;

/**
 * inheriting Computer interface and override start() method
 * */
public class Laptop implements Computer {

    @Override
    public String start() {
        return "Laptop started...";
    }

}
