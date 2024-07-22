package com.constructor.injection.beans;

public class Student {

    private int rollno;

    public Student(int rollno) {
        this.rollno = rollno;
        System.out.println("instance of student created using int constructor");
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
        System.out.println("setter called for roll no");
    }

}
