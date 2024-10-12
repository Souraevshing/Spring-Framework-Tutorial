package com.autowire.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Sourav";
    private Car car;

    public Person() {
        System.out.println("Person non param cons called");
    }

    public Person(Car car) {
        this.car = car;
        System.out.println("Person created");
    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        if (car == null) {
            System.out.println("No car");
        } else {
            System.out.printf("Car :%s\n", car.getCarName());
        }
    }

}
