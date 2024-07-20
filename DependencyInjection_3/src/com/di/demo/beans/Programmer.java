package com.di.demo.beans;

/**
 * this is the target class where we are creating Computer reference
 * and using constructor to pass Computer reference and assigning local reference with instance reference
 * */
public class Programmer {

    private Computer computer;

    public Programmer(Computer computer) {
        this.computer = computer;
    }

    public void start() {
        System.out.println(computer.start());
    }

}
