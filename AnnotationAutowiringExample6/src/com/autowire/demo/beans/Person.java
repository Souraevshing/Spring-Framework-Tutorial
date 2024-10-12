package com.autowire.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private Car car;

    public Person(Car car) {
        this.car = car;
        System.out.println("Car cons called");
    }

    public Person(@Value("Sourav") String name) {
        this.name = name;
        System.out.println("Person cons called");
    }

//    This constructor will solve the exception since we are using @Autowired to tell spring to use given name and initializing the Car class
//    @Autowired
//    public Person(@Value("Sourav") String name, Car car) {
//        this.name = name;
//        this.car = car;
//        System.out.println("Person cons called");
//    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        if (car==null) {
            System.out.println("No car");
        } else {
            System.out.printf("Car: %s\n", car.getCarName());
        }
    }

}
