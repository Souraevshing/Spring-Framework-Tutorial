package com.set.injection.beans;

import java.util.Set;

public class Student {

    private int rollno;
    private String name;
    private Set<String> emails;

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

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
        System.out.println("setter called for email");
    }
}
