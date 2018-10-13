package com.shelydexter;

public class Account {

    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account() {
        this(12345678, 0.00, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String name, String email, String phone) {
        this(99999999, 100.55, name, email, phone);
    }

    public Account(int number, double balance, String name, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public void printInformation() {
        System.out.println("Account number: " + this.number);
        System.out.println("Balance: " + this.balance);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
    }

    public void setNumber(int number) {
        System.out.println("Account number set to " + number);
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setBalance(double balance) {
        System.out.println("Balance set to " + balance);
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        System.out.println("Name sent to " + name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        System.out.println("Email set to " + email);
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhone(String phone) {
        System.out.println("Phone number set to " + phone);
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void depositFunds(double funds) {
        System.out.println("Depositied $" + funds + " into account");
        this.balance += funds;
    }

    public void withdrawFunds(double funds) {
        if (funds > this.balance) {
            System.out.printf("Insufficient funds.\n");
        } else {
            System.out.println("Withdrew $" + funds + " from account");
            this.balance -= funds;
        }
    }
}
