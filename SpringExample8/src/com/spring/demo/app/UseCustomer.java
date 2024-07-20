package com.spring.demo.app;

import com.spring.demo.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCustomer {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/demo/resources/application-conf.xml");
        Customer customer1 = context.getBean("customer1", Customer.class);
        System.out.println("==========");
        System.out.printf("Customer name: %s",customer1.getName());
        System.out.printf("Customer account id: %s", customer1.getAccount().getAccountId());
        System.out.printf("Customer balance: %f", customer1.getAccount().getBalance());
        System.out.println("==========");
        Customer customer2 = context.getBean("customer2", Customer.class);
        System.out.printf("Customer name: %s",customer2.getName());
        System.out.printf("Customer account id: %s", customer2.getAccount().getAccountId());
        System.out.printf("Customer balance: %f", customer2.getAccount().getBalance());
    }
}