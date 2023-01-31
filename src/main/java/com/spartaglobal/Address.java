package com.spartaglobal;

public class Address {
    private int houseNo = 0;
    private String street = "";
    private String town = "";

    public Address (int nHo, String street, String town){
        this.houseNo = nHo;
        this.street = street;
        this.town = town;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public String getAddressString() {
        return "Address: " + houseNo + " " + street + ", " + town;
    }




}
