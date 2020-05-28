package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Unknown", 300000, "default@email.com");
        //System.out.println("Empty Constructor...");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
        //System.out.println("2 Parameter Constructor...");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        //System.out.println("3 Parameter Constructor...");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerInfo() {
        return "Customer: " + getName() +
                "\nCredit Limit: " + getCreditLimit() +
                "\nEmail: " + getEmail() +
                "\n--------------------------";
    }
}
