package com.constructor.injection.beans;

public class Address {

    private int houseNo;
    private String locality;
    private String city;

    public Address(String city) {
        this.city=city;
    }

    public Address() {
        System.out.println("non param const of Address called");
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLength() {
        return locality.length();
    }

}
