package com.constructor.injection.beans;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
        System.out.println("instance of student created using string constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter called for name");
    }
}
