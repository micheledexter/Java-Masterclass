package com.shelydexter;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default", 0.00, "default@example.com");
        System.out.println("Default VIP customer created");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@example.com");
        System.out.println(name + " created with credit limit of " + creditLimit + " using default email address");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("VIP customer " + name + " created with credit limit of " + creditLimit + " and email " + emailAddress);
    }
}
