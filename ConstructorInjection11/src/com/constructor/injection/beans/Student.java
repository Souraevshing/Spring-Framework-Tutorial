package com.constructor.injection.beans;

public class Student {

    private String name;
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter called for name");
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        System.out.println("setter called for teacher");
    }
}
