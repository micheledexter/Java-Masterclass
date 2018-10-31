package com.shelydexter;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name) {
        this(name, new ArrayList<>());
    }

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public boolean createTransaction(double transactionAmount) {
        if (transactionAmount < 0) {
            System.out.println("Transaction amount must be positive");
            return false;
        }
        transactions.add(transactionAmount);
        System.out.println("Transaction for " + transactionAmount + " added for " + name);
        return true;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }
}
