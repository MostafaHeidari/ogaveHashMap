package com.Mostafa;

public class Customer implements ICustomer{

    public String name;

    public String phoneNumber;

    public String address;

    public String email;

    public Customer(String name, String phoneNumber, String address, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String phoneNumber() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String address() {
        return null;
    }

    @Override
    public String email() {
        return null;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "Name=" + name +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
