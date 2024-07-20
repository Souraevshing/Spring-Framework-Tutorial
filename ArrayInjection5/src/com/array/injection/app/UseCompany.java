package com.array.injection.app;

import com.array.injection.beans.Company;
import com.array.injection.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCompany {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/com/array/injection/resources/application-conf.xml");
        Company company = context.getBean("company", Company.class);
        System.out.printf("Company name: %s\n", company.getCompanyName());
        System.out.printf("Total employees: %d\n", company.getEmployees().size());
        System.out.println("Employee details:\n");
        System.out.println("Employee name\tEmployee id\n");
        System.out.println("============================");
        for (Employee employee : company.getEmployees()) {
            System.out.printf("%s\t%s", employee.getEmployeeName(), employee.getEmployeeId());
            System.out.println("\n");
        }

    }
}