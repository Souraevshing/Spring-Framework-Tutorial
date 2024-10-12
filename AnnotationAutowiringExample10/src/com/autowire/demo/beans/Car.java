package com.autowire.demo.beans;

public class Car {

    private String carName;

    public Car(String name) {
        carName = name;
        System.out.println("Car cons called");
    }

    public String getCarName() {
        return carName;
    }

}
