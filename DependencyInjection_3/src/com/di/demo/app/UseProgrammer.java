package com.di.demo.app;

import com.di.demo.beans.Laptop;
import com.di.demo.beans.Desktop;
import com.di.demo.beans.Programmer;

/**
 * creating 2 Programmer reference
 * first one pointing to Laptop class passed inside constructor of Programmer class
 * second one pointing to Desktop class passed inside constructor of Programmer class
 * */
public class UseProgrammer {

    public static void main(String[] args) {
        System.out.println("inside UseProgrammer");
        Programmer programmer1 = new Programmer(new Laptop());
        programmer1.start();
        Programmer programmer2 = new Programmer(new Desktop());
        programmer2.start();
    }

}
