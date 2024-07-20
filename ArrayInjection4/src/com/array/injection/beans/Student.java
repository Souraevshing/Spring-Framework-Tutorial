package com.array.injection.beans;

import java.util.*;

public class Student {

    private int rollno;
    private String name;
    private List<String>subjects;
    private List<Integer> marks;

    public Student() {
        System.out.println("instance of Student created");
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
        System.out.println("setter called for subjects");
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
        System.out.println("setter called for marks");
    }
}
