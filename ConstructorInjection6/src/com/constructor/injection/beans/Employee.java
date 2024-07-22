package com.constructor.injection.beans;

public class Employee {

    private String name;
    private String designation;
    private float salary;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
        System.out.println("instance of employee created using string-string constructor");
    }
    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("instance of employee created using string-float constructor");
    }

    public Employee(float salary, String name) {
        this.salary = salary;
        this.name = name;
        System.out.println("instance of employee created using float-string constructor");
    }

    public void show() {
        System.out.printf("Employee name: %s\nEmployee salary: %f\nEmployee designation: %s", name, salary, designation);
    }
}
