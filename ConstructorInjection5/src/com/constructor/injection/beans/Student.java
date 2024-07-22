package com.constructor.injection.beans;

public class Student {

    private int roll;
    private String name;

    public Student(int roll,String name) {
        System.out.println("instance of Student created using int-str constructor");
        this.roll=roll;
        this.name = name;
    }

    public Student(String fname,String lname) {
        System.out.println("Student bean initialized using str-str constructor");
        this.roll=0;
        this.name = fname+" "+lname;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
