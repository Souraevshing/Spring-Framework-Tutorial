package com.map.injection.beans;

import java.util.Map;

public class Student {

    private int rollno;
    private String name;
    private Map<String, Integer> performance;

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

    public Map<String, Integer> getPerformance() {
        return performance;
    }

    public void setPerformance(Map<String, Integer> performance) {
        this.performance = performance;
        System.out.println("setter called for performance");
    }
}
