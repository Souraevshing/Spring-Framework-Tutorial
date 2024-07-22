package com.constructor.injection.beans;

public class Employee {
    private String name;
    private String designation;
    private float salary;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
        System.out.println("bean initialized using str-str constructor");
    }

    public Employee(float salary,String name) {
        this.name = name;
        this.salary=salary;
        System.out.println("bean initialized using float-str constructor");
    }

    public Employee(String designation, float salary) {
        this.designation = designation;
        this.salary=salary;
        System.out.println("bean initialized using str-float constructor");
    }

    public void show() {
        System.out.println("Name:"+name);
        System.out.println("Designation:"+designation);
        System.out.println("salary:"+salary);
    }

}