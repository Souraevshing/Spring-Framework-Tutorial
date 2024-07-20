package com.array.injection.beans;

public class Student {

    private int rollno;
    private String name;
    private String[] subjects;

    public Student() {
        System.out.println("student instance created");
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
        System.out.println("setter called for roll no");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter called for name");
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
        System.out.println("setter called for subjects");
    }
}
