package com.array.injection.beans;

public class Company {

    private String companyName;
    private Employee [] employees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
        System.out.println("setter called for company name");
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
        System.out.println("setter called for employees");
    }
}
