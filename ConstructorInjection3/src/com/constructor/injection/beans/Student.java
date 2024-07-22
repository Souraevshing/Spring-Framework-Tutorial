package com.constructor.injection.beans;

public class Student {

    private int roll;
    private String name;

    public Student(String name) {
        this.name = name;
        System.out.println("instance of student created using str-constructor");
    }

    public Student(int roll) {
        this.roll = roll;
        System.out.println("instance of student created using int-constructor");
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
        System.out.println("setter called for roll");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter called for name");
    }
}
