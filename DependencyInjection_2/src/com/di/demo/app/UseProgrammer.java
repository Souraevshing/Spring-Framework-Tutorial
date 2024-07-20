package com.di.demo.app;

import com.di.demo.beans.Programmer;

/**
 * DI using composition (Has-A relationship)
 * */

public class UseProgrammer {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.start();
    }
}