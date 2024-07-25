package com.constructorref.demo.beans;

public class Student {

    private int roll;
    private String name;
    private Address address;

    public Student(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    public Student() {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UseStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
