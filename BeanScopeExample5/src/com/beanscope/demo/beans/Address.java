package com.beanscope.demo.beans;

public class Address {

    private int houseNo;
    private String city;

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address() {
        System.out.println("instance of address created");
    }
}
