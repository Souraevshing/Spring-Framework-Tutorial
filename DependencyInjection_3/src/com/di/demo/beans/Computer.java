package com.di.demo.beans;

/**
 * creating interface and one abstract method inside Computer interface
 * creating interface is the solution to resolve using multiple Classes to create instance
 * invoking start() method inside Desktop and Laptop class to inherit this method and use DI
 * */
public interface Computer {

    String start();

}
