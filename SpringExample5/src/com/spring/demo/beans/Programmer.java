package com.spring.demo.beans;

public class Programmer {

    private String name;

    public Programmer() {
        System.out.println("programmer created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter for name called");
    }

}
