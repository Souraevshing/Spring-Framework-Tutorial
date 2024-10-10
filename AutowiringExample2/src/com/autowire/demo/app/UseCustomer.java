package com.autowire.demo.app;

import com.autowire.demo.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCustomer {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/autowire/demo/resources/application-conf.xml");
        Customer customer = applicationContext.getBean("customer", Customer.class);
        customer.display();
    }

}
