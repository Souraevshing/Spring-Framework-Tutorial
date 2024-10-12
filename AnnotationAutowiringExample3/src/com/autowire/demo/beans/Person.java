package com.autowire.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Sourav";
    private Car car;

    @Autowired
    public Person(Car car) {
        this.car = car;
        System.out.println("Person cons called");
    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Person car is: %s\n", car.getCarName());
    }

}
