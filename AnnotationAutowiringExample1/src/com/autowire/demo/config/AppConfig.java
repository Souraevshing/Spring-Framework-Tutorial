package com.autowire.demo.config;

import com.autowire.demo.beans.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.autowire.demo.beans")
public class AppConfig {

    @Bean
    public Car car1() {
        return new Car("Honda Amaze");
    }

    @Bean
    public Car car2() {
        return new Car("Tata Punch");
    }

}
