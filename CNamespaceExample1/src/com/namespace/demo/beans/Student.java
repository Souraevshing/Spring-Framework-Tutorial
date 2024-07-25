package com.namespace.demo.beans;

public class Student {

    public Student(int rollno, String name, String gender) {
        this.rollno = rollno;
        this.name = name;
        this.gender = gender;
    }

    private int rollno;
    private String name;
    private String gender;

    public Student() {
        System.out.println("instance of student created");
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
}
