package com.constructor.injection.beans;

public class Student {

    private int roll;
    private String name;

    public Student() {
        System.out.println("non param const of Student called");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    private Address address;

    public Student(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        System.out.println("instance of student created using int-string-address constructor");
    }
}
