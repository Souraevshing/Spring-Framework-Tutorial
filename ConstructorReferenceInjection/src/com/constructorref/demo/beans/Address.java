package com.constructorref.demo.beans;

public class Address {
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

    private int houseNo;
    private String locality;
    private String city;

    public Address(int houseNo, String locality, String city) {
        this.houseNo = houseNo;
        this.locality = locality;
        this.city = city;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
