package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        // Your job is to create a simple application.
        // There should be a Bank class
        // It should have an ArrayList of Branches
        // Each Branch should have an ArrayList of Customers
        // The Customer class should have an ArrayList of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration of autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("First Bank");

        if (bank.addBranch("Minneapolis")) {
            System.out.println("Minneapolis branch created");
        }

        bank.addBranch("Minneapolis");

        bank.addCustomer("Minneapolis", "Shely", 50.05);
        bank.addCustomer("Minneapolis", "Dexter", 175.34);
        bank.addCustomer("Minneapolis", "Bob", 220.12);

        bank.addBranch("Saint Paul");
        bank.addCustomer("Saint Paul", "Carl", 150.54);

        bank.addCustomerTransaction("Minneapolis", "Shely", 44.22);
        bank.addCustomerTransaction("Minneapolis", "Shely", 12.44);
        bank.addCustomerTransaction("Minneapolis", "Dexter", 1.65);

        bank.listCustomers("Minneapolis", true);
        bank.listCustomers("Saint Paul", true);

        bank.addBranch("Duluth");

        if (!bank.addCustomer("Duluth", "Phil", 5.53)) {
            System.out.println("Error Duluth branch does not exist");
        }

        if (!bank.addBranch("Minneapolis")) {
            System.out.println("Minneapolis branch already exists");
        }

        if (!bank.addCustomerTransaction("Minneapolis", "Frank", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Minneapolis", "Shely", 12.21)) {
            System.out.println("Customer Shely already exists");
        }
    }
}
