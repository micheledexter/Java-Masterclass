package com.shelydexter;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch() {
        this(new ArrayList<>());
    }

    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addNewCustomer(Customer customer) {
        this.customers.add(customer);
        System.out.println("Customer " + customer.getName() + " added to branch.");
    }

    public String getCustomers() {
        String list = "";
        for (Customer customer: this.customers) {
            list += customer.getName() + " has transactions " + customer.getTransactions().toString() + "\n";
        }
        return list;
    }

    public int numberOfCustomers() {
        return this.customers.size();
    }
}
