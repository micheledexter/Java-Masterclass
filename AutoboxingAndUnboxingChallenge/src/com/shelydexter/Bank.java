package com.shelydexter;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(Branch branch) {
        this.branches.add(branch);
        System.out.println("Bank with branch initialized.");
    }

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
        System.out.println("Bank with " + branches.size() + " branches initialized");
    }

    public String getBranches() {
        int numberOfBranches = this.branches.size();
        String list = "There are " + numberOfBranches + " branches.\n";
        if (numberOfBranches <= 0)
            return list;
        for (int i = 0; i < numberOfBranches; i++) {
            list += "Branch " + (i+1) + " has " + this.branches.get(i).numberOfCustomers() + " customers.\n";
        }
        return list;
    }
}
