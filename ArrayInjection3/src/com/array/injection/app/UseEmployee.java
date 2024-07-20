package com.array.injection.app;

import com.array.injection.beans.Company;
import com.array.injection.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/com/array/injection/resources/application-conf.xml");
        Company company = context.getBean("company", Company.class);
        System.out.printf("Company Name: %s", company.getCompanyName());
        System.out.println();
        for (Employee employee : company.getEmployees()) {
            System.out.printf("Employee name: %s \n", employee.getEmployeeName());
            System.out.printf("Employee id: %d \n", employee.getEmployeeId());
        }

    }
}