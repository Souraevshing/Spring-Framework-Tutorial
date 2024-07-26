package com.beanscope.demo.beans;

public class Student {
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

    private int rollno;
    private String name;

    public Student() {
        System.out.println("instance of student created");
    }
}
