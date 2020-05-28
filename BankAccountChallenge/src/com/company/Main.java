package com.company;

public class Main {

    public static void main(String[] args) {
        //BankAccount cust1 = new BankAccount();
        BankAccount cust1 = new BankAccount("Caylem Harris","harris1@gmail.com","+27113456789", 30245, 200000.0);
        System.out.println(cust1.getCustomerInfo());
        System.out.println("Current Balance = " + cust1.getBalance() + "\n--------------------------");
        cust1.withdrawFunds(2000);
        cust1.withdrawFunds(-200);
        cust1.withdrawFunds(198000);
        cust1.withdrawFunds(1000);
        cust1.depositFunds(0);
        cust1.depositFunds(2000);

        System.out.println("\n-------------------------");
        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("Donna Clay",500000);
        VipCustomer vip3 = new VipCustomer("Andrew McFalrane", 800000, "aMac@gmail.com");
        System.out.println(vip1.getCustomerInfo());
        System.out.println(vip2.getCustomerInfo());
        System.out.println(vip3.getCustomerInfo());
    }
}
