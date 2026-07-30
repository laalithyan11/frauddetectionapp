package com.finance.frauddetection.model;

public class Customer {

    private int id;
    private String name;
    private String accountNumber;
    private String registeredCountry;

    // Parameterized Constructor
    public Customer(int id, String name, String accountNumber, String registeredCountry) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.registeredCountry = registeredCountry;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for registeredCountry
    public String getRegisteredCountry() {
        return registeredCountry;
    }

    public void setRegisteredCountry(String registeredCountry) {
        this.registeredCountry = registeredCountry;
    }
}