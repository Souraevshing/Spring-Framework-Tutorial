package com.autowire.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private Car car;

    @Autowired
    public Person(Car car) {
        this.car = car;
        System.out.println("Car cons called");
    }

    public Person(@Value("Sourav") String name) {
        this.name = name;
        System.out.println("Car parameterized cons called");
    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        if (car==null) {
            System.out.println("No car");
        } else {
            System.out.printf("Car: %s\n", car.getCarName());
        }
    }

}
