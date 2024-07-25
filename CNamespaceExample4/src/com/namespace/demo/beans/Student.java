package com.namespace.demo.beans;

public class Student {
    public Student() {
        System.out.println("instance of student created");
    }

    private int rollno;
    private String name;
    private String gender;
    private Address address;

    public Student(int rollno, String name, String gender, Address address) {
        this.rollno = rollno;
        this.name = name;
        this.gender = gender;
        this.address = address;
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

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
