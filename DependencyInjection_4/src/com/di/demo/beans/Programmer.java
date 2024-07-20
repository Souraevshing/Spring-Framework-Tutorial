package com.di.demo.beans;

public class Programmer {

    private Computer computer;
    public Computer getComputer() {
        return  computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void start() {
        System.out.println(computer.start());
    }

}
