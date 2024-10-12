package com.autowire.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Sourav";
    private Car car;

    public Person(Car car) {
        this.car = car;
        System.out.println("Person cons called");
    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Person car: %s\n", car.getCarName());
    }

}
