package com.di.demo.beans;

/**
 * creating instance of Laptop to invoke start() method
 * the problem with this approach is that if in the future, Programmer wants to create other class
 * here Desktop class object, then we have to make changes in both class since both classes are tightly coupled
 * Also, it becomes responsibility of Programmer class to create object of both class
 * */
public class Programmer {

    private Laptop laptop;

    public void start() {
        laptop = new Laptop("MSI");
        System.out.println(laptop.start());
    }
}
