package com.di.demo.beans;

public class Laptop implements Computer{

    @Override
    public String start() {
        return "Laptop started...";
    }

}
