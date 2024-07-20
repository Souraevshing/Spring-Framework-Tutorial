package com.di.demo.beans;

/**
 * inheriting Computer interface and override start() method
 * */
public class Desktop implements Computer {

    @Override
    public String start() {
        return "Desktop started...";
    }

}
