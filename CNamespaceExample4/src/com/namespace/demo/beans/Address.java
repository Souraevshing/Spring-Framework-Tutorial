package com.namespace.demo.beans;

public class Address {

    private int houseNo;
    private String city;
    private String locality;

    public Address(int houseNo, String city, String locality) {
        this.houseNo = houseNo;
        this.city = city;
        this.locality = locality;
    }

    public Address() {
    }

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

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", city='" + city + '\'' +
                ", locality='" + locality + '\'' +
                '}';
    }
}
