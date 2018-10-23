package com.shelydexter;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(Branch branch) {
        this.branches.add(branch);
        System.out.println("Bank with branch initialized.");
    }

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
        System.out.println("Bank with " + branches.size() + " branches initialized");
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
