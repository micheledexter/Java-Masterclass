package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // But not allow the withdrawal to complete if there are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account spending = new Account();
        spending.setNumber(13572468);
        System.out.println(spending.getNumber());
        spending.setBalance(12.34);
        System.out.println(spending.getBalance());
        spending.setName("Shely");
        System.out.println(spending.getName());
        spending.setEmail("shely@example.com");
        System.out.println(spending.getEmail());
        spending.setPhone("555-555-5555");
        System.out.println(spending.getPhone());
        spending.depositFunds(86.66);
        System.out.println(spending.getBalance());
        spending.withdrawFunds(100);
        System.out.println(spending.getBalance());
        spending.withdrawFunds(98.65);
        System.out.println(spending.getBalance());

        Account savings = new Account (24681357, 100.00, "Shely", "shely@example.com", "555-555-5555");

        Account unknown = new Account();

        Account blank = new Account("Bob", "bob@example.com", "555-123-5555");

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters won't be needed
        // test and confirm it works.

        VipCustomer snerf = new VipCustomer();
        VipCustomer mehhemmm = new VipCustomer("Mumflr", 10000.00);
        VipCustomer diggledeedoo = new VipCustomer("Ahem", 1000000.00, "ahem@example.com");
    }
}
