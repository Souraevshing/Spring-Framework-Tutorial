package com.array.injection.beans;

import java.util.List;

public class Company {

    private String companyName;
    private List<Employee> employees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
        System.out.println("setter called for company name");
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
        System.out.println("setter called for employees");
    }
}
