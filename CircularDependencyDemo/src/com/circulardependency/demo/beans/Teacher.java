package com.circulardependency.demo.beans;

public class Teacher {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter called for name inside teacher");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
        System.out.println("setter called for student inside teacher");
    }

    private String name;
    private Student student;

}
