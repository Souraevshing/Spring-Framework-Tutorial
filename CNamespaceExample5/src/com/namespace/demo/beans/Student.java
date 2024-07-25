package com.namespace.demo.beans;

public class Student {

    private int rollno;
    private String name;
    private String gender;
    private Address address;
    private Subject subj;

    public Student(int rollno, String name, String gender, Address address, Subject subj) {
        this.rollno = rollno;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.subj = subj;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Subject getSubj() {
        return subj;
    }

    public void setSubj(Subject subj) {
        this.subj = subj;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", subj=" + subj +
                '}';
    }
}
