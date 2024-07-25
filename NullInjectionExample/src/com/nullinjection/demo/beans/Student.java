package com.nullinjection.demo.beans;

import java.util.Date;

public class Student {

    private int rollno;
    private String name;
    private Date dobDate;

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

    public Date getDobDate() {
        return dobDate;
    }

    public void setDobDate(Date dobDate) {
        this.dobDate = dobDate;
    }

    public void display() {
        System.out.printf("Name %s\n", name);
        System.out.printf("Roll no %d\n", rollno);
        System.out.printf("Date of birth %s\n", dobDate);
    }

    public Student(int rollno, String name, Date dobDate) {
        this.rollno = rollno;
        this.name = name;
        this.dobDate = dobDate;
    }

    public Student() {
    }
}
