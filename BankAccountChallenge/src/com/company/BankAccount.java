package com.company;

import java.util.prefs.BackingStoreException;

public class BankAccount {
    private int accNumber;
    private double balance;
    private String custName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("Unknown","Unknown","Unknown",00000,0.0);
        System.out.println("Empty Constructor...");
    }

    public BankAccount(String name, String email, String phoneNum, int accNum, double balance) {
        System.out.println("Constructor with parameters...");
        custName = name;
        this.email = email;
        phoneNumber = phoneNum;
        accNumber = accNum;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerInfo() {
        return "Customer: " + custName +
                "\nEmail: " + email +
                "\nPhone Number: " + phoneNumber +
                "\nAccount No.: " + accNumber +
                "\n--------------------------";
    }

    public void depositFunds(double deposit) {
        System.out.println("Depositing...");
        if(deposit <= 0) {
            System.out.println("Invalid Entry");
        } else {
            System.out.println("Deposit = " + deposit);
            balance += deposit;
            System.out.println("Your new Balance is: " + balance);
        }
    }

    public void withdrawFunds(double withdraw) {
        System.out.println("Withdrawing...");
        if (withdraw <= 0.0) {
            System.out.println("Invalid Entry!");
        } else if(balance <= 0.0 || balance < withdraw) {
            System.out.println("Withdraw = " + withdraw);
            System.out.println("Sorry, insufficient Funds!");
        } else {
            System.out.println("Withdraw = " + withdraw);
            balance -= withdraw;
            System.out.println("Your new Balance is: " + balance);
        }
    }

}
