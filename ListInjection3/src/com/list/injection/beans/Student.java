package com.list.injection.beans;

import java.util.ArrayList;
import java.util.LinkedList;

public class Student {

    private int rollno;
    private String name;
    private ArrayList<String> subjects;
    private LinkedList<Integer> marks;

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

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
        System.out.println("setter called for subjects");
    }

    public LinkedList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(LinkedList<Integer> marks) {
        this.marks = marks;
        System.out.println("setter called for marks");
    }
}
