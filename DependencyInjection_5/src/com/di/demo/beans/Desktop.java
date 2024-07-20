package com.di.demo.beans;

public class Desktop implements Computer {

    @Override
    public String start() {
        return "Desktop started...";
    }

}
