package com.autowire.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String carName = "Punch";

    public Car() {
        System.out.println("Car cons called");
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

}
