package com.autowire.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Sourav";
    private Car car;

    public Person() {
        System.out.println("Person cons called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
        System.out.println("Setter for setCar called");
    }

    public void display() {
        System.out.printf("Person name: %s\n", name);
        System.out.printf("Person car: %s\n", car.getCarName());
    }

}
