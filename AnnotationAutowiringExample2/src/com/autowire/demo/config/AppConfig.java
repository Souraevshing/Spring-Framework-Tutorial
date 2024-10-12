package com.autowire.demo.config;

import com.autowire.demo.beans.Car;
import com.autowire.demo.beans.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Person.class, Car.class})
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig cons called");
    }

}
