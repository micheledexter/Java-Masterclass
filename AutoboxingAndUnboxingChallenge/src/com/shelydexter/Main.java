package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an ArrayList of Branches
        // Each Branch should have an ArrayList of Customers
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstrate autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Customer carl = new Customer("Carl");
        Customer dave = new Customer("Dave");
        carl.createTransaction(7.35);
        carl.createTransaction(10.98);
        dave.createTransaction(9.99);
        dave.createTransaction(12.34);
        System.out.println(carl.getTransactions());
        System.out.println(dave.getTransactions());

        Branch firstBranch = new Branch();
        System.out.println(firstBranch.getCustomers());
        firstBranch.addNewCustomer(carl);
        System.out.println(firstBranch.getCustomers());
        firstBranch.addNewCustomer(dave);
        System.out.println(firstBranch.getCustomers());

        Bank firstBank = new Bank(firstBranch);
        System.out.println(firstBank.getBranches());
    }
}
