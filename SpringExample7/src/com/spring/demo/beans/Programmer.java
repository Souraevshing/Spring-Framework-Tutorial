package com.spring.demo.beans;

public class Programmer {

    private String name;
    private Computer computer;

    public Programmer() {
        System.out.println("programmer created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter for name called");;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
        System.out.println("setter for programmer called");
    }

    public void writeCode() {
        if(computer.start()) {
            System.out.println("writing code");
        } else {
            System.out.println("done writing code");
        }
    }
}
