package com.di.demo.app;

import com.di.demo.beans.Desktop;
import com.di.demo.beans.Laptop;
import com.di.demo.beans.Programmer;

/**
 * DI using setters
 * creating Programmer instance and using setComputer setter method and passing Laptop class as argument
 * creating Programmer instance and using setComputer setter method and passing Desktop class as argument
 * */
public class UseProgrammer {
    public static void main(String[] args) {
        System.out.println("inside UseProgrammer");
        Programmer programmer1 = new Programmer();
        programmer1.setComputer(new Laptop());
        programmer1.start();
        Programmer programmer2 = new Programmer();
        programmer2.setComputer(new Desktop());
        programmer2.start();
    }
}